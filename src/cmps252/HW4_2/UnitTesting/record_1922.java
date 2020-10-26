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

@Tag("42")
class Record_1922 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1922: FirstName is Darell")
	void FirstNameOfRecord1922() {
		assertEquals("Darell", customers.get(1921).getFirstName());
	}

	@Test
	@DisplayName("Record 1922: LastName is Galang")
	void LastNameOfRecord1922() {
		assertEquals("Galang", customers.get(1921).getLastName());
	}

	@Test
	@DisplayName("Record 1922: Company is Saltsman, Nyl S Esq")
	void CompanyOfRecord1922() {
		assertEquals("Saltsman, Nyl S Esq", customers.get(1921).getCompany());
	}

	@Test
	@DisplayName("Record 1922: Address is 780 Swift Blvd  #-160")
	void AddressOfRecord1922() {
		assertEquals("780 Swift Blvd  #-160", customers.get(1921).getAddress());
	}

	@Test
	@DisplayName("Record 1922: City is Richland")
	void CityOfRecord1922() {
		assertEquals("Richland", customers.get(1921).getCity());
	}

	@Test
	@DisplayName("Record 1922: County is Benton")
	void CountyOfRecord1922() {
		assertEquals("Benton", customers.get(1921).getCounty());
	}

	@Test
	@DisplayName("Record 1922: State is WA")
	void StateOfRecord1922() {
		assertEquals("WA", customers.get(1921).getState());
	}

	@Test
	@DisplayName("Record 1922: ZIP is 99352")
	void ZIPOfRecord1922() {
		assertEquals("99352", customers.get(1921).getZIP());
	}

	@Test
	@DisplayName("Record 1922: Phone is 509-783-9318")
	void PhoneOfRecord1922() {
		assertEquals("509-783-9318", customers.get(1921).getPhone());
	}

	@Test
	@DisplayName("Record 1922: Fax is 509-783-6335")
	void FaxOfRecord1922() {
		assertEquals("509-783-6335", customers.get(1921).getFax());
	}

	@Test
	@DisplayName("Record 1922: Email is darell@galang.com")
	void EmailOfRecord1922() {
		assertEquals("darell@galang.com", customers.get(1921).getEmail());
	}

	@Test
	@DisplayName("Record 1922: Web is http://www.darellgalang.com")
	void WebOfRecord1922() {
		assertEquals("http://www.darellgalang.com", customers.get(1921).getWeb());
	}
}
