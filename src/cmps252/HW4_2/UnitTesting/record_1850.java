package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("24")
class Record_1850 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1850: FirstName is Lyman")
	void FirstNameOfRecord1850() {
		assertEquals("Lyman", customers.get(1849).getFirstName());
	}

	@Test
	@DisplayName("Record 1850: LastName is Vanweerd")
	void LastNameOfRecord1850() {
		assertEquals("Vanweerd", customers.get(1849).getLastName());
	}

	@Test
	@DisplayName("Record 1850: Company is Jetstream Systems Inc")
	void CompanyOfRecord1850() {
		assertEquals("Jetstream Systems Inc", customers.get(1849).getCompany());
	}

	@Test
	@DisplayName("Record 1850: Address is 2727 Allen Pky")
	void AddressOfRecord1850() {
		assertEquals("2727 Allen Pky", customers.get(1849).getAddress());
	}

	@Test
	@DisplayName("Record 1850: City is Houston")
	void CityOfRecord1850() {
		assertEquals("Houston", customers.get(1849).getCity());
	}

	@Test
	@DisplayName("Record 1850: County is Harris")
	void CountyOfRecord1850() {
		assertEquals("Harris", customers.get(1849).getCountry());
	}

	@Test
	@DisplayName("Record 1850: State is TX")
	void StateOfRecord1850() {
		assertEquals("TX", customers.get(1849).getState());
	}

	@Test
	@DisplayName("Record 1850: ZIP is 77019")
	void ZIPOfRecord1850() {
		assertEquals("77019", customers.get(1849).getZIP());
	}

	@Test
	@DisplayName("Record 1850: Phone is 713-831-5227")
	void PhoneOfRecord1850() {
		assertEquals("713-831-5227", customers.get(1849).getPhone());
	}

	@Test
	@DisplayName("Record 1850: Fax is 713-831-7129")
	void FaxOfRecord1850() {
		assertEquals("713-831-7129", customers.get(1849).getFax());
	}

	@Test
	@DisplayName("Record 1850: Email is lyman@vanweerd.com")
	void EmailOfRecord1850() {
		assertEquals("lyman@vanweerd.com", customers.get(1849).getEmail());
	}

	@Test
	@DisplayName("Record 1850: Web is http://www.lymanvanweerd.com")
	void WebOfRecord1850() {
		assertEquals("http://www.lymanvanweerd.com", customers.get(1849).getWeb());
	}
}
