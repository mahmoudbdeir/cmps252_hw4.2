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
class Record_1616 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1616: FirstName is Kristine")
	void FirstNameOfRecord1616() {
		assertEquals("Kristine", customers.get(1615).getFirstName());
	}

	@Test
	@DisplayName("Record 1616: LastName is Wela")
	void LastNameOfRecord1616() {
		assertEquals("Wela", customers.get(1615).getLastName());
	}

	@Test
	@DisplayName("Record 1616: Company is Data Search Associates")
	void CompanyOfRecord1616() {
		assertEquals("Data Search Associates", customers.get(1615).getCompany());
	}

	@Test
	@DisplayName("Record 1616: Address is 250 Clearbrook Rd")
	void AddressOfRecord1616() {
		assertEquals("250 Clearbrook Rd", customers.get(1615).getAddress());
	}

	@Test
	@DisplayName("Record 1616: City is Elmsford")
	void CityOfRecord1616() {
		assertEquals("Elmsford", customers.get(1615).getCity());
	}

	@Test
	@DisplayName("Record 1616: County is Westchester")
	void CountyOfRecord1616() {
		assertEquals("Westchester", customers.get(1615).getCounty());
	}

	@Test
	@DisplayName("Record 1616: State is NY")
	void StateOfRecord1616() {
		assertEquals("NY", customers.get(1615).getState());
	}

	@Test
	@DisplayName("Record 1616: ZIP is 10523")
	void ZIPOfRecord1616() {
		assertEquals("10523", customers.get(1615).getZIP());
	}

	@Test
	@DisplayName("Record 1616: Phone is 914-592-7835")
	void PhoneOfRecord1616() {
		assertEquals("914-592-7835", customers.get(1615).getPhone());
	}

	@Test
	@DisplayName("Record 1616: Fax is 914-592-3764")
	void FaxOfRecord1616() {
		assertEquals("914-592-3764", customers.get(1615).getFax());
	}

	@Test
	@DisplayName("Record 1616: Email is kristine@wela.com")
	void EmailOfRecord1616() {
		assertEquals("kristine@wela.com", customers.get(1615).getEmail());
	}

	@Test
	@DisplayName("Record 1616: Web is http://www.kristinewela.com")
	void WebOfRecord1616() {
		assertEquals("http://www.kristinewela.com", customers.get(1615).getWeb());
	}
}
