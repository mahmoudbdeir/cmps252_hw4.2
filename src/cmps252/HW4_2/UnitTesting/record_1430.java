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

@Tag("31")
class Record_1430 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1430: FirstName is Darrick")
	void FirstNameOfRecord1430() {
		assertEquals("Darrick", customers.get(1429).getFirstName());
	}

	@Test
	@DisplayName("Record 1430: LastName is Thesing")
	void LastNameOfRecord1430() {
		assertEquals("Thesing", customers.get(1429).getLastName());
	}

	@Test
	@DisplayName("Record 1430: Company is Vargas, Francis V Iii")
	void CompanyOfRecord1430() {
		assertEquals("Vargas, Francis V Iii", customers.get(1429).getCompany());
	}

	@Test
	@DisplayName("Record 1430: Address is 98211 Pali Momi St  #-615a")
	void AddressOfRecord1430() {
		assertEquals("98211 Pali Momi St  #-615a", customers.get(1429).getAddress());
	}

	@Test
	@DisplayName("Record 1430: City is Aiea")
	void CityOfRecord1430() {
		assertEquals("Aiea", customers.get(1429).getCity());
	}

	@Test
	@DisplayName("Record 1430: County is Honolulu")
	void CountyOfRecord1430() {
		assertEquals("Honolulu", customers.get(1429).getCounty());
	}

	@Test
	@DisplayName("Record 1430: State is HI")
	void StateOfRecord1430() {
		assertEquals("HI", customers.get(1429).getState());
	}

	@Test
	@DisplayName("Record 1430: ZIP is 96701")
	void ZIPOfRecord1430() {
		assertEquals("96701", customers.get(1429).getZIP());
	}

	@Test
	@DisplayName("Record 1430: Phone is 808-487-4998")
	void PhoneOfRecord1430() {
		assertEquals("808-487-4998", customers.get(1429).getPhone());
	}

	@Test
	@DisplayName("Record 1430: Fax is 808-487-4057")
	void FaxOfRecord1430() {
		assertEquals("808-487-4057", customers.get(1429).getFax());
	}

	@Test
	@DisplayName("Record 1430: Email is darrick@thesing.com")
	void EmailOfRecord1430() {
		assertEquals("darrick@thesing.com", customers.get(1429).getEmail());
	}

	@Test
	@DisplayName("Record 1430: Web is http://www.darrickthesing.com")
	void WebOfRecord1430() {
		assertEquals("http://www.darrickthesing.com", customers.get(1429).getWeb());
	}
}
