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

@Tag("1")
class Record_2591 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2591: FirstName is Lorri")
	void FirstNameOfRecord2591() {
		assertEquals("Lorri", customers.get(2590).getFirstName());
	}

	@Test
	@DisplayName("Record 2591: LastName is Kittrell")
	void LastNameOfRecord2591() {
		assertEquals("Kittrell", customers.get(2590).getLastName());
	}

	@Test
	@DisplayName("Record 2591: Company is New England Pest Control Co")
	void CompanyOfRecord2591() {
		assertEquals("New England Pest Control Co", customers.get(2590).getCompany());
	}

	@Test
	@DisplayName("Record 2591: Address is 423 W 11th St")
	void AddressOfRecord2591() {
		assertEquals("423 W 11th St", customers.get(2590).getAddress());
	}

	@Test
	@DisplayName("Record 2591: City is Erie")
	void CityOfRecord2591() {
		assertEquals("Erie", customers.get(2590).getCity());
	}

	@Test
	@DisplayName("Record 2591: County is Erie")
	void CountyOfRecord2591() {
		assertEquals("Erie", customers.get(2590).getCounty());
	}

	@Test
	@DisplayName("Record 2591: State is PA")
	void StateOfRecord2591() {
		assertEquals("PA", customers.get(2590).getState());
	}

	@Test
	@DisplayName("Record 2591: ZIP is 16501")
	void ZIPOfRecord2591() {
		assertEquals("16501", customers.get(2590).getZIP());
	}

	@Test
	@DisplayName("Record 2591: Phone is 814-459-3058")
	void PhoneOfRecord2591() {
		assertEquals("814-459-3058", customers.get(2590).getPhone());
	}

	@Test
	@DisplayName("Record 2591: Fax is 814-459-0961")
	void FaxOfRecord2591() {
		assertEquals("814-459-0961", customers.get(2590).getFax());
	}

	@Test
	@DisplayName("Record 2591: Email is lorri@kittrell.com")
	void EmailOfRecord2591() {
		assertEquals("lorri@kittrell.com", customers.get(2590).getEmail());
	}

	@Test
	@DisplayName("Record 2591: Web is http://www.lorrikittrell.com")
	void WebOfRecord2591() {
		assertEquals("http://www.lorrikittrell.com", customers.get(2590).getWeb());
	}
}
