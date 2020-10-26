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

@Tag("21")
class Record_943 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 943: FirstName is Lorie")
	void FirstNameOfRecord943() {
		assertEquals("Lorie", customers.get(942).getFirstName());
	}

	@Test
	@DisplayName("Record 943: LastName is Rout")
	void LastNameOfRecord943() {
		assertEquals("Rout", customers.get(942).getLastName());
	}

	@Test
	@DisplayName("Record 943: Company is State Highway Dist 5 Crdt Un")
	void CompanyOfRecord943() {
		assertEquals("State Highway Dist 5 Crdt Un", customers.get(942).getCompany());
	}

	@Test
	@DisplayName("Record 943: Address is 1239 Cambridge Ave")
	void AddressOfRecord943() {
		assertEquals("1239 Cambridge Ave", customers.get(942).getAddress());
	}

	@Test
	@DisplayName("Record 943: City is Camden")
	void CityOfRecord943() {
		assertEquals("Camden", customers.get(942).getCity());
	}

	@Test
	@DisplayName("Record 943: County is Camden")
	void CountyOfRecord943() {
		assertEquals("Camden", customers.get(942).getCounty());
	}

	@Test
	@DisplayName("Record 943: State is NJ")
	void StateOfRecord943() {
		assertEquals("NJ", customers.get(942).getState());
	}

	@Test
	@DisplayName("Record 943: ZIP is 8105")
	void ZIPOfRecord943() {
		assertEquals("8105", customers.get(942).getZIP());
	}

	@Test
	@DisplayName("Record 943: Phone is 856-541-6381")
	void PhoneOfRecord943() {
		assertEquals("856-541-6381", customers.get(942).getPhone());
	}

	@Test
	@DisplayName("Record 943: Fax is 856-541-8025")
	void FaxOfRecord943() {
		assertEquals("856-541-8025", customers.get(942).getFax());
	}

	@Test
	@DisplayName("Record 943: Email is lorie@rout.com")
	void EmailOfRecord943() {
		assertEquals("lorie@rout.com", customers.get(942).getEmail());
	}

	@Test
	@DisplayName("Record 943: Web is http://www.lorierout.com")
	void WebOfRecord943() {
		assertEquals("http://www.lorierout.com", customers.get(942).getWeb());
	}
}
