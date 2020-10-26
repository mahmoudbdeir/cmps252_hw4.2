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

@Tag("43")
class Record_1013 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1013: FirstName is Blaine")
	void FirstNameOfRecord1013() {
		assertEquals("Blaine", customers.get(1012).getFirstName());
	}

	@Test
	@DisplayName("Record 1013: LastName is Gillam")
	void LastNameOfRecord1013() {
		assertEquals("Gillam", customers.get(1012).getLastName());
	}

	@Test
	@DisplayName("Record 1013: Company is Tri Medical Supply Inc")
	void CompanyOfRecord1013() {
		assertEquals("Tri Medical Supply Inc", customers.get(1012).getCompany());
	}

	@Test
	@DisplayName("Record 1013: Address is 3050 Taylor Rd")
	void AddressOfRecord1013() {
		assertEquals("3050 Taylor Rd", customers.get(1012).getAddress());
	}

	@Test
	@DisplayName("Record 1013: City is Roseville")
	void CityOfRecord1013() {
		assertEquals("Roseville", customers.get(1012).getCity());
	}

	@Test
	@DisplayName("Record 1013: County is Placer")
	void CountyOfRecord1013() {
		assertEquals("Placer", customers.get(1012).getCounty());
	}

	@Test
	@DisplayName("Record 1013: State is CA")
	void StateOfRecord1013() {
		assertEquals("CA", customers.get(1012).getState());
	}

	@Test
	@DisplayName("Record 1013: ZIP is 95678")
	void ZIPOfRecord1013() {
		assertEquals("95678", customers.get(1012).getZIP());
	}

	@Test
	@DisplayName("Record 1013: Phone is 916-782-7003")
	void PhoneOfRecord1013() {
		assertEquals("916-782-7003", customers.get(1012).getPhone());
	}

	@Test
	@DisplayName("Record 1013: Fax is 916-782-8139")
	void FaxOfRecord1013() {
		assertEquals("916-782-8139", customers.get(1012).getFax());
	}

	@Test
	@DisplayName("Record 1013: Email is blaine@gillam.com")
	void EmailOfRecord1013() {
		assertEquals("blaine@gillam.com", customers.get(1012).getEmail());
	}

	@Test
	@DisplayName("Record 1013: Web is http://www.blainegillam.com")
	void WebOfRecord1013() {
		assertEquals("http://www.blainegillam.com", customers.get(1012).getWeb());
	}
}
