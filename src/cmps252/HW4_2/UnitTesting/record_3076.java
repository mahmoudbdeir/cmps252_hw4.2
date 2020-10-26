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

@Tag("38")
class Record_3076 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3076: FirstName is Teresa")
	void FirstNameOfRecord3076() {
		assertEquals("Teresa", customers.get(3075).getFirstName());
	}

	@Test
	@DisplayName("Record 3076: LastName is Chauvin")
	void LastNameOfRecord3076() {
		assertEquals("Chauvin", customers.get(3075).getLastName());
	}

	@Test
	@DisplayName("Record 3076: Company is Williamson Appraisal Service")
	void CompanyOfRecord3076() {
		assertEquals("Williamson Appraisal Service", customers.get(3075).getCompany());
	}

	@Test
	@DisplayName("Record 3076: Address is 2819 Augusta Hwy")
	void AddressOfRecord3076() {
		assertEquals("2819 Augusta Hwy", customers.get(3075).getAddress());
	}

	@Test
	@DisplayName("Record 3076: City is West Columbia")
	void CityOfRecord3076() {
		assertEquals("West Columbia", customers.get(3075).getCity());
	}

	@Test
	@DisplayName("Record 3076: County is Lexington")
	void CountyOfRecord3076() {
		assertEquals("Lexington", customers.get(3075).getCounty());
	}

	@Test
	@DisplayName("Record 3076: State is SC")
	void StateOfRecord3076() {
		assertEquals("SC", customers.get(3075).getState());
	}

	@Test
	@DisplayName("Record 3076: ZIP is 29170")
	void ZIPOfRecord3076() {
		assertEquals("29170", customers.get(3075).getZIP());
	}

	@Test
	@DisplayName("Record 3076: Phone is 803-794-7574")
	void PhoneOfRecord3076() {
		assertEquals("803-794-7574", customers.get(3075).getPhone());
	}

	@Test
	@DisplayName("Record 3076: Fax is 803-794-2344")
	void FaxOfRecord3076() {
		assertEquals("803-794-2344", customers.get(3075).getFax());
	}

	@Test
	@DisplayName("Record 3076: Email is teresa@chauvin.com")
	void EmailOfRecord3076() {
		assertEquals("teresa@chauvin.com", customers.get(3075).getEmail());
	}

	@Test
	@DisplayName("Record 3076: Web is http://www.teresachauvin.com")
	void WebOfRecord3076() {
		assertEquals("http://www.teresachauvin.com", customers.get(3075).getWeb());
	}
}
