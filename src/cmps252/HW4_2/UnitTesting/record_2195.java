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

@Tag("5")
class Record_2195 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2195: FirstName is Oma")
	void FirstNameOfRecord2195() {
		assertEquals("Oma", customers.get(2194).getFirstName());
	}

	@Test
	@DisplayName("Record 2195: LastName is Bradway")
	void LastNameOfRecord2195() {
		assertEquals("Bradway", customers.get(2194).getLastName());
	}

	@Test
	@DisplayName("Record 2195: Company is Valley Manor Nurse & Rehab Ctr")
	void CompanyOfRecord2195() {
		assertEquals("Valley Manor Nurse & Rehab Ctr", customers.get(2194).getCompany());
	}

	@Test
	@DisplayName("Record 2195: Address is 72200 Vista Chino")
	void AddressOfRecord2195() {
		assertEquals("72200 Vista Chino", customers.get(2194).getAddress());
	}

	@Test
	@DisplayName("Record 2195: City is Thousand Palms")
	void CityOfRecord2195() {
		assertEquals("Thousand Palms", customers.get(2194).getCity());
	}

	@Test
	@DisplayName("Record 2195: County is Riverside")
	void CountyOfRecord2195() {
		assertEquals("Riverside", customers.get(2194).getCounty());
	}

	@Test
	@DisplayName("Record 2195: State is CA")
	void StateOfRecord2195() {
		assertEquals("CA", customers.get(2194).getState());
	}

	@Test
	@DisplayName("Record 2195: ZIP is 92276")
	void ZIPOfRecord2195() {
		assertEquals("92276", customers.get(2194).getZIP());
	}

	@Test
	@DisplayName("Record 2195: Phone is 760-343-3255")
	void PhoneOfRecord2195() {
		assertEquals("760-343-3255", customers.get(2194).getPhone());
	}

	@Test
	@DisplayName("Record 2195: Fax is 760-343-3847")
	void FaxOfRecord2195() {
		assertEquals("760-343-3847", customers.get(2194).getFax());
	}

	@Test
	@DisplayName("Record 2195: Email is oma@bradway.com")
	void EmailOfRecord2195() {
		assertEquals("oma@bradway.com", customers.get(2194).getEmail());
	}

	@Test
	@DisplayName("Record 2195: Web is http://www.omabradway.com")
	void WebOfRecord2195() {
		assertEquals("http://www.omabradway.com", customers.get(2194).getWeb());
	}
}
