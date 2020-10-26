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

@Tag("19")
class Record_3250 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3250: FirstName is Emilie")
	void FirstNameOfRecord3250() {
		assertEquals("Emilie", customers.get(3249).getFirstName());
	}

	@Test
	@DisplayName("Record 3250: LastName is Satter")
	void LastNameOfRecord3250() {
		assertEquals("Satter", customers.get(3249).getLastName());
	}

	@Test
	@DisplayName("Record 3250: Company is Wa Mutl A Fed Svngs Bnk")
	void CompanyOfRecord3250() {
		assertEquals("Wa Mutl A Fed Svngs Bnk", customers.get(3249).getCompany());
	}

	@Test
	@DisplayName("Record 3250: Address is 2810 Morris Ave")
	void AddressOfRecord3250() {
		assertEquals("2810 Morris Ave", customers.get(3249).getAddress());
	}

	@Test
	@DisplayName("Record 3250: City is Union")
	void CityOfRecord3250() {
		assertEquals("Union", customers.get(3249).getCity());
	}

	@Test
	@DisplayName("Record 3250: County is Union")
	void CountyOfRecord3250() {
		assertEquals("Union", customers.get(3249).getCounty());
	}

	@Test
	@DisplayName("Record 3250: State is NJ")
	void StateOfRecord3250() {
		assertEquals("NJ", customers.get(3249).getState());
	}

	@Test
	@DisplayName("Record 3250: ZIP is 7083")
	void ZIPOfRecord3250() {
		assertEquals("7083", customers.get(3249).getZIP());
	}

	@Test
	@DisplayName("Record 3250: Phone is 908-688-4021")
	void PhoneOfRecord3250() {
		assertEquals("908-688-4021", customers.get(3249).getPhone());
	}

	@Test
	@DisplayName("Record 3250: Fax is 908-688-6833")
	void FaxOfRecord3250() {
		assertEquals("908-688-6833", customers.get(3249).getFax());
	}

	@Test
	@DisplayName("Record 3250: Email is emilie@satter.com")
	void EmailOfRecord3250() {
		assertEquals("emilie@satter.com", customers.get(3249).getEmail());
	}

	@Test
	@DisplayName("Record 3250: Web is http://www.emiliesatter.com")
	void WebOfRecord3250() {
		assertEquals("http://www.emiliesatter.com", customers.get(3249).getWeb());
	}
}
