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

@Tag("13")
class Record_969 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 969: FirstName is Don")
	void FirstNameOfRecord969() {
		assertEquals("Don", customers.get(968).getFirstName());
	}

	@Test
	@DisplayName("Record 969: LastName is Anzora")
	void LastNameOfRecord969() {
		assertEquals("Anzora", customers.get(968).getLastName());
	}

	@Test
	@DisplayName("Record 969: Company is Custard Gem Services")
	void CompanyOfRecord969() {
		assertEquals("Custard Gem Services", customers.get(968).getCompany());
	}

	@Test
	@DisplayName("Record 969: Address is 110 N Washington St  #-500")
	void AddressOfRecord969() {
		assertEquals("110 N Washington St  #-500", customers.get(968).getAddress());
	}

	@Test
	@DisplayName("Record 969: City is Rockville")
	void CityOfRecord969() {
		assertEquals("Rockville", customers.get(968).getCity());
	}

	@Test
	@DisplayName("Record 969: County is Montgomery")
	void CountyOfRecord969() {
		assertEquals("Montgomery", customers.get(968).getCounty());
	}

	@Test
	@DisplayName("Record 969: State is MD")
	void StateOfRecord969() {
		assertEquals("MD", customers.get(968).getState());
	}

	@Test
	@DisplayName("Record 969: ZIP is 20850")
	void ZIPOfRecord969() {
		assertEquals("20850", customers.get(968).getZIP());
	}

	@Test
	@DisplayName("Record 969: Phone is 301-217-7148")
	void PhoneOfRecord969() {
		assertEquals("301-217-7148", customers.get(968).getPhone());
	}

	@Test
	@DisplayName("Record 969: Fax is 301-217-1918")
	void FaxOfRecord969() {
		assertEquals("301-217-1918", customers.get(968).getFax());
	}

	@Test
	@DisplayName("Record 969: Email is don@anzora.com")
	void EmailOfRecord969() {
		assertEquals("don@anzora.com", customers.get(968).getEmail());
	}

	@Test
	@DisplayName("Record 969: Web is http://www.donanzora.com")
	void WebOfRecord969() {
		assertEquals("http://www.donanzora.com", customers.get(968).getWeb());
	}
}
