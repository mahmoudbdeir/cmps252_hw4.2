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

@Tag("16")
class Record_1385 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1385: FirstName is Cory")
	void FirstNameOfRecord1385() {
		assertEquals("Cory", customers.get(1384).getFirstName());
	}

	@Test
	@DisplayName("Record 1385: LastName is Meath")
	void LastNameOfRecord1385() {
		assertEquals("Meath", customers.get(1384).getLastName());
	}

	@Test
	@DisplayName("Record 1385: Company is Arenac Abstract & Title Co")
	void CompanyOfRecord1385() {
		assertEquals("Arenac Abstract & Title Co", customers.get(1384).getCompany());
	}

	@Test
	@DisplayName("Record 1385: Address is 432 Constitution Ave")
	void AddressOfRecord1385() {
		assertEquals("432 Constitution Ave", customers.get(1384).getAddress());
	}

	@Test
	@DisplayName("Record 1385: City is Camarillo")
	void CityOfRecord1385() {
		assertEquals("Camarillo", customers.get(1384).getCity());
	}

	@Test
	@DisplayName("Record 1385: County is Ventura")
	void CountyOfRecord1385() {
		assertEquals("Ventura", customers.get(1384).getCounty());
	}

	@Test
	@DisplayName("Record 1385: State is CA")
	void StateOfRecord1385() {
		assertEquals("CA", customers.get(1384).getState());
	}

	@Test
	@DisplayName("Record 1385: ZIP is 93012")
	void ZIPOfRecord1385() {
		assertEquals("93012", customers.get(1384).getZIP());
	}

	@Test
	@DisplayName("Record 1385: Phone is 805-388-9150")
	void PhoneOfRecord1385() {
		assertEquals("805-388-9150", customers.get(1384).getPhone());
	}

	@Test
	@DisplayName("Record 1385: Fax is 805-388-8346")
	void FaxOfRecord1385() {
		assertEquals("805-388-8346", customers.get(1384).getFax());
	}

	@Test
	@DisplayName("Record 1385: Email is cory@meath.com")
	void EmailOfRecord1385() {
		assertEquals("cory@meath.com", customers.get(1384).getEmail());
	}

	@Test
	@DisplayName("Record 1385: Web is http://www.corymeath.com")
	void WebOfRecord1385() {
		assertEquals("http://www.corymeath.com", customers.get(1384).getWeb());
	}
}
