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
class Record_3174 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3174: FirstName is Willis")
	void FirstNameOfRecord3174() {
		assertEquals("Willis", customers.get(3173).getFirstName());
	}

	@Test
	@DisplayName("Record 3174: LastName is Boyko")
	void LastNameOfRecord3174() {
		assertEquals("Boyko", customers.get(3173).getLastName());
	}

	@Test
	@DisplayName("Record 3174: Company is Crafts & Stuff")
	void CompanyOfRecord3174() {
		assertEquals("Crafts & Stuff", customers.get(3173).getCompany());
	}

	@Test
	@DisplayName("Record 3174: Address is 13421 Grass Valley Ave")
	void AddressOfRecord3174() {
		assertEquals("13421 Grass Valley Ave", customers.get(3173).getAddress());
	}

	@Test
	@DisplayName("Record 3174: City is Grass Valley")
	void CityOfRecord3174() {
		assertEquals("Grass Valley", customers.get(3173).getCity());
	}

	@Test
	@DisplayName("Record 3174: County is Nevada")
	void CountyOfRecord3174() {
		assertEquals("Nevada", customers.get(3173).getCounty());
	}

	@Test
	@DisplayName("Record 3174: State is CA")
	void StateOfRecord3174() {
		assertEquals("CA", customers.get(3173).getState());
	}

	@Test
	@DisplayName("Record 3174: ZIP is 95945")
	void ZIPOfRecord3174() {
		assertEquals("95945", customers.get(3173).getZIP());
	}

	@Test
	@DisplayName("Record 3174: Phone is 530-273-2212")
	void PhoneOfRecord3174() {
		assertEquals("530-273-2212", customers.get(3173).getPhone());
	}

	@Test
	@DisplayName("Record 3174: Fax is 530-273-4324")
	void FaxOfRecord3174() {
		assertEquals("530-273-4324", customers.get(3173).getFax());
	}

	@Test
	@DisplayName("Record 3174: Email is willis@boyko.com")
	void EmailOfRecord3174() {
		assertEquals("willis@boyko.com", customers.get(3173).getEmail());
	}

	@Test
	@DisplayName("Record 3174: Web is http://www.willisboyko.com")
	void WebOfRecord3174() {
		assertEquals("http://www.willisboyko.com", customers.get(3173).getWeb());
	}
}
