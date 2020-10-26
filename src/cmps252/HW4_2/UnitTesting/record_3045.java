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
class Record_3045 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3045: FirstName is Lorri")
	void FirstNameOfRecord3045() {
		assertEquals("Lorri", customers.get(3044).getFirstName());
	}

	@Test
	@DisplayName("Record 3045: LastName is Randolf")
	void LastNameOfRecord3045() {
		assertEquals("Randolf", customers.get(3044).getLastName());
	}

	@Test
	@DisplayName("Record 3045: Company is Hubbs Importing Corp")
	void CompanyOfRecord3045() {
		assertEquals("Hubbs Importing Corp", customers.get(3044).getCompany());
	}

	@Test
	@DisplayName("Record 3045: Address is 781 Church St")
	void AddressOfRecord3045() {
		assertEquals("781 Church St", customers.get(3044).getAddress());
	}

	@Test
	@DisplayName("Record 3045: City is New Bedford")
	void CityOfRecord3045() {
		assertEquals("New Bedford", customers.get(3044).getCity());
	}

	@Test
	@DisplayName("Record 3045: County is Bristol")
	void CountyOfRecord3045() {
		assertEquals("Bristol", customers.get(3044).getCounty());
	}

	@Test
	@DisplayName("Record 3045: State is MA")
	void StateOfRecord3045() {
		assertEquals("MA", customers.get(3044).getState());
	}

	@Test
	@DisplayName("Record 3045: ZIP is 2745")
	void ZIPOfRecord3045() {
		assertEquals("2745", customers.get(3044).getZIP());
	}

	@Test
	@DisplayName("Record 3045: Phone is 508-995-6374")
	void PhoneOfRecord3045() {
		assertEquals("508-995-6374", customers.get(3044).getPhone());
	}

	@Test
	@DisplayName("Record 3045: Fax is 508-995-2684")
	void FaxOfRecord3045() {
		assertEquals("508-995-2684", customers.get(3044).getFax());
	}

	@Test
	@DisplayName("Record 3045: Email is lorri@randolf.com")
	void EmailOfRecord3045() {
		assertEquals("lorri@randolf.com", customers.get(3044).getEmail());
	}

	@Test
	@DisplayName("Record 3045: Web is http://www.lorrirandolf.com")
	void WebOfRecord3045() {
		assertEquals("http://www.lorrirandolf.com", customers.get(3044).getWeb());
	}
}
