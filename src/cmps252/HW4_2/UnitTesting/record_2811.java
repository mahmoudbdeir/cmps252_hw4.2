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

@Tag("0")
class Record_2811 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2811: FirstName is Caitlin")
	void FirstNameOfRecord2811() {
		assertEquals("Caitlin", customers.get(2810).getFirstName());
	}

	@Test
	@DisplayName("Record 2811: LastName is Lidtke")
	void LastNameOfRecord2811() {
		assertEquals("Lidtke", customers.get(2810).getLastName());
	}

	@Test
	@DisplayName("Record 2811: Company is Noel E Vargas Ii Attorney At")
	void CompanyOfRecord2811() {
		assertEquals("Noel E Vargas Ii Attorney At", customers.get(2810).getCompany());
	}

	@Test
	@DisplayName("Record 2811: Address is 12450 Bissonnet St")
	void AddressOfRecord2811() {
		assertEquals("12450 Bissonnet St", customers.get(2810).getAddress());
	}

	@Test
	@DisplayName("Record 2811: City is Houston")
	void CityOfRecord2811() {
		assertEquals("Houston", customers.get(2810).getCity());
	}

	@Test
	@DisplayName("Record 2811: County is Harris")
	void CountyOfRecord2811() {
		assertEquals("Harris", customers.get(2810).getCounty());
	}

	@Test
	@DisplayName("Record 2811: State is TX")
	void StateOfRecord2811() {
		assertEquals("TX", customers.get(2810).getState());
	}

	@Test
	@DisplayName("Record 2811: ZIP is 77099")
	void ZIPOfRecord2811() {
		assertEquals("77099", customers.get(2810).getZIP());
	}

	@Test
	@DisplayName("Record 2811: Phone is 281-879-4411")
	void PhoneOfRecord2811() {
		assertEquals("281-879-4411", customers.get(2810).getPhone());
	}

	@Test
	@DisplayName("Record 2811: Fax is 281-879-9191")
	void FaxOfRecord2811() {
		assertEquals("281-879-9191", customers.get(2810).getFax());
	}

	@Test
	@DisplayName("Record 2811: Email is caitlin@lidtke.com")
	void EmailOfRecord2811() {
		assertEquals("caitlin@lidtke.com", customers.get(2810).getEmail());
	}

	@Test
	@DisplayName("Record 2811: Web is http://www.caitlinlidtke.com")
	void WebOfRecord2811() {
		assertEquals("http://www.caitlinlidtke.com", customers.get(2810).getWeb());
	}
}
