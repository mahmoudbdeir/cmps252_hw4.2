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

@Tag("42")
class Record_1234 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1234: FirstName is Bernadine")
	void FirstNameOfRecord1234() {
		assertEquals("Bernadine", customers.get(1233).getFirstName());
	}

	@Test
	@DisplayName("Record 1234: LastName is Pennelle")
	void LastNameOfRecord1234() {
		assertEquals("Pennelle", customers.get(1233).getLastName());
	}

	@Test
	@DisplayName("Record 1234: Company is Circle K Corp")
	void CompanyOfRecord1234() {
		assertEquals("Circle K Corp", customers.get(1233).getCompany());
	}

	@Test
	@DisplayName("Record 1234: Address is 1478 N Palm Canyon Dr")
	void AddressOfRecord1234() {
		assertEquals("1478 N Palm Canyon Dr", customers.get(1233).getAddress());
	}

	@Test
	@DisplayName("Record 1234: City is Palm Springs")
	void CityOfRecord1234() {
		assertEquals("Palm Springs", customers.get(1233).getCity());
	}

	@Test
	@DisplayName("Record 1234: County is Riverside")
	void CountyOfRecord1234() {
		assertEquals("Riverside", customers.get(1233).getCounty());
	}

	@Test
	@DisplayName("Record 1234: State is CA")
	void StateOfRecord1234() {
		assertEquals("CA", customers.get(1233).getState());
	}

	@Test
	@DisplayName("Record 1234: ZIP is 92262")
	void ZIPOfRecord1234() {
		assertEquals("92262", customers.get(1233).getZIP());
	}

	@Test
	@DisplayName("Record 1234: Phone is 760-320-8756")
	void PhoneOfRecord1234() {
		assertEquals("760-320-8756", customers.get(1233).getPhone());
	}

	@Test
	@DisplayName("Record 1234: Fax is 760-320-7413")
	void FaxOfRecord1234() {
		assertEquals("760-320-7413", customers.get(1233).getFax());
	}

	@Test
	@DisplayName("Record 1234: Email is bernadine@pennelle.com")
	void EmailOfRecord1234() {
		assertEquals("bernadine@pennelle.com", customers.get(1233).getEmail());
	}

	@Test
	@DisplayName("Record 1234: Web is http://www.bernadinepennelle.com")
	void WebOfRecord1234() {
		assertEquals("http://www.bernadinepennelle.com", customers.get(1233).getWeb());
	}
}
