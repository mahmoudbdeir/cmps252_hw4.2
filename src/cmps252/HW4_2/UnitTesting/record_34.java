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

@Tag("49")
class Record_34 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 34: FirstName is Alfonso")
	void FirstNameOfRecord34() {
		assertEquals("Alfonso", customers.get(33).getFirstName());
	}

	@Test
	@DisplayName("Record 34: LastName is Canerday")
	void LastNameOfRecord34() {
		assertEquals("Canerday", customers.get(33).getLastName());
	}

	@Test
	@DisplayName("Record 34: Company is Cirrus Logic Colorado")
	void CompanyOfRecord34() {
		assertEquals("Cirrus Logic Colorado", customers.get(33).getCompany());
	}

	@Test
	@DisplayName("Record 34: Address is 200 Atrium Dr")
	void AddressOfRecord34() {
		assertEquals("200 Atrium Dr", customers.get(33).getAddress());
	}

	@Test
	@DisplayName("Record 34: City is Somerset")
	void CityOfRecord34() {
		assertEquals("Somerset", customers.get(33).getCity());
	}

	@Test
	@DisplayName("Record 34: County is Somerset")
	void CountyOfRecord34() {
		assertEquals("Somerset", customers.get(33).getCounty());
	}

	@Test
	@DisplayName("Record 34: State is NJ")
	void StateOfRecord34() {
		assertEquals("NJ", customers.get(33).getState());
	}

	@Test
	@DisplayName("Record 34: ZIP is 8873")
	void ZIPOfRecord34() {
		assertEquals("8873", customers.get(33).getZIP());
	}

	@Test
	@DisplayName("Record 34: Phone is 732-937-8343")
	void PhoneOfRecord34() {
		assertEquals("732-937-8343", customers.get(33).getPhone());
	}

	@Test
	@DisplayName("Record 34: Fax is 732-937-4501")
	void FaxOfRecord34() {
		assertEquals("732-937-4501", customers.get(33).getFax());
	}

	@Test
	@DisplayName("Record 34: Email is alfonso@canerday.com")
	void EmailOfRecord34() {
		assertEquals("alfonso@canerday.com", customers.get(33).getEmail());
	}

	@Test
	@DisplayName("Record 34: Web is http://www.alfonsocanerday.com")
	void WebOfRecord34() {
		assertEquals("http://www.alfonsocanerday.com", customers.get(33).getWeb());
	}
}
