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

@Tag("22")
class Record_1875 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1875: FirstName is Aisha")
	void FirstNameOfRecord1875() {
		assertEquals("Aisha", customers.get(1874).getFirstName());
	}

	@Test
	@DisplayName("Record 1875: LastName is Yants")
	void LastNameOfRecord1875() {
		assertEquals("Yants", customers.get(1874).getLastName());
	}

	@Test
	@DisplayName("Record 1875: Company is Minuteman Press")
	void CompanyOfRecord1875() {
		assertEquals("Minuteman Press", customers.get(1874).getCompany());
	}

	@Test
	@DisplayName("Record 1875: Address is 36 E Main St")
	void AddressOfRecord1875() {
		assertEquals("36 E Main St", customers.get(1874).getAddress());
	}

	@Test
	@DisplayName("Record 1875: City is Somerville")
	void CityOfRecord1875() {
		assertEquals("Somerville", customers.get(1874).getCity());
	}

	@Test
	@DisplayName("Record 1875: County is Somerset")
	void CountyOfRecord1875() {
		assertEquals("Somerset", customers.get(1874).getCounty());
	}

	@Test
	@DisplayName("Record 1875: State is NJ")
	void StateOfRecord1875() {
		assertEquals("NJ", customers.get(1874).getState());
	}

	@Test
	@DisplayName("Record 1875: ZIP is 8876")
	void ZIPOfRecord1875() {
		assertEquals("8876", customers.get(1874).getZIP());
	}

	@Test
	@DisplayName("Record 1875: Phone is 908-704-2746")
	void PhoneOfRecord1875() {
		assertEquals("908-704-2746", customers.get(1874).getPhone());
	}

	@Test
	@DisplayName("Record 1875: Fax is 908-704-9498")
	void FaxOfRecord1875() {
		assertEquals("908-704-9498", customers.get(1874).getFax());
	}

	@Test
	@DisplayName("Record 1875: Email is aisha@yants.com")
	void EmailOfRecord1875() {
		assertEquals("aisha@yants.com", customers.get(1874).getEmail());
	}

	@Test
	@DisplayName("Record 1875: Web is http://www.aishayants.com")
	void WebOfRecord1875() {
		assertEquals("http://www.aishayants.com", customers.get(1874).getWeb());
	}
}
