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

@Tag("1")
class Record_1955 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1955: FirstName is Bernice")
	void FirstNameOfRecord1955() {
		assertEquals("Bernice", customers.get(1954).getFirstName());
	}

	@Test
	@DisplayName("Record 1955: LastName is Decambra")
	void LastNameOfRecord1955() {
		assertEquals("Decambra", customers.get(1954).getLastName());
	}

	@Test
	@DisplayName("Record 1955: Company is Williams Cox Wydner & Cox")
	void CompanyOfRecord1955() {
		assertEquals("Williams Cox Wydner & Cox", customers.get(1954).getCompany());
	}

	@Test
	@DisplayName("Record 1955: Address is 1 Main")
	void AddressOfRecord1955() {
		assertEquals("1 Main", customers.get(1954).getAddress());
	}

	@Test
	@DisplayName("Record 1955: City is Grenloch")
	void CityOfRecord1955() {
		assertEquals("Grenloch", customers.get(1954).getCity());
	}

	@Test
	@DisplayName("Record 1955: County is Gloucester")
	void CountyOfRecord1955() {
		assertEquals("Gloucester", customers.get(1954).getCounty());
	}

	@Test
	@DisplayName("Record 1955: State is NJ")
	void StateOfRecord1955() {
		assertEquals("NJ", customers.get(1954).getState());
	}

	@Test
	@DisplayName("Record 1955: ZIP is 8032")
	void ZIPOfRecord1955() {
		assertEquals("8032", customers.get(1954).getZIP());
	}

	@Test
	@DisplayName("Record 1955: Phone is 856-232-7460")
	void PhoneOfRecord1955() {
		assertEquals("856-232-7460", customers.get(1954).getPhone());
	}

	@Test
	@DisplayName("Record 1955: Fax is 856-232-6594")
	void FaxOfRecord1955() {
		assertEquals("856-232-6594", customers.get(1954).getFax());
	}

	@Test
	@DisplayName("Record 1955: Email is bernice@decambra.com")
	void EmailOfRecord1955() {
		assertEquals("bernice@decambra.com", customers.get(1954).getEmail());
	}

	@Test
	@DisplayName("Record 1955: Web is http://www.bernicedecambra.com")
	void WebOfRecord1955() {
		assertEquals("http://www.bernicedecambra.com", customers.get(1954).getWeb());
	}
}
