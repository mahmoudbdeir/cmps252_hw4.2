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

@Tag("8")
class Record_1750 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1750: FirstName is Aida")
	void FirstNameOfRecord1750() {
		assertEquals("Aida", customers.get(1749).getFirstName());
	}

	@Test
	@DisplayName("Record 1750: LastName is Saxe")
	void LastNameOfRecord1750() {
		assertEquals("Saxe", customers.get(1749).getLastName());
	}

	@Test
	@DisplayName("Record 1750: Company is Med Alert")
	void CompanyOfRecord1750() {
		assertEquals("Med Alert", customers.get(1749).getCompany());
	}

	@Test
	@DisplayName("Record 1750: Address is 77 Cooper Ave")
	void AddressOfRecord1750() {
		assertEquals("77 Cooper Ave", customers.get(1749).getAddress());
	}

	@Test
	@DisplayName("Record 1750: City is Landisville")
	void CityOfRecord1750() {
		assertEquals("Landisville", customers.get(1749).getCity());
	}

	@Test
	@DisplayName("Record 1750: County is Lancaster")
	void CountyOfRecord1750() {
		assertEquals("Lancaster", customers.get(1749).getCounty());
	}

	@Test
	@DisplayName("Record 1750: State is PA")
	void StateOfRecord1750() {
		assertEquals("PA", customers.get(1749).getState());
	}

	@Test
	@DisplayName("Record 1750: ZIP is 17538")
	void ZIPOfRecord1750() {
		assertEquals("17538", customers.get(1749).getZIP());
	}

	@Test
	@DisplayName("Record 1750: Phone is 717-898-4097")
	void PhoneOfRecord1750() {
		assertEquals("717-898-4097", customers.get(1749).getPhone());
	}

	@Test
	@DisplayName("Record 1750: Fax is 717-898-8978")
	void FaxOfRecord1750() {
		assertEquals("717-898-8978", customers.get(1749).getFax());
	}

	@Test
	@DisplayName("Record 1750: Email is aida@saxe.com")
	void EmailOfRecord1750() {
		assertEquals("aida@saxe.com", customers.get(1749).getEmail());
	}

	@Test
	@DisplayName("Record 1750: Web is http://www.aidasaxe.com")
	void WebOfRecord1750() {
		assertEquals("http://www.aidasaxe.com", customers.get(1749).getWeb());
	}
}
