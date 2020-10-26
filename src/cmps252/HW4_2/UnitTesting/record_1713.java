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

@Tag("25")
class Record_1713 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1713: FirstName is Dallas")
	void FirstNameOfRecord1713() {
		assertEquals("Dallas", customers.get(1712).getFirstName());
	}

	@Test
	@DisplayName("Record 1713: LastName is Drabek")
	void LastNameOfRecord1713() {
		assertEquals("Drabek", customers.get(1712).getLastName());
	}

	@Test
	@DisplayName("Record 1713: Company is Regina Pizzeria")
	void CompanyOfRecord1713() {
		assertEquals("Regina Pizzeria", customers.get(1712).getCompany());
	}

	@Test
	@DisplayName("Record 1713: Address is 1900 S State St")
	void AddressOfRecord1713() {
		assertEquals("1900 S State St", customers.get(1712).getAddress());
	}

	@Test
	@DisplayName("Record 1713: City is Girard")
	void CityOfRecord1713() {
		assertEquals("Girard", customers.get(1712).getCity());
	}

	@Test
	@DisplayName("Record 1713: County is Trumbull")
	void CountyOfRecord1713() {
		assertEquals("Trumbull", customers.get(1712).getCounty());
	}

	@Test
	@DisplayName("Record 1713: State is OH")
	void StateOfRecord1713() {
		assertEquals("OH", customers.get(1712).getState());
	}

	@Test
	@DisplayName("Record 1713: ZIP is 44420")
	void ZIPOfRecord1713() {
		assertEquals("44420", customers.get(1712).getZIP());
	}

	@Test
	@DisplayName("Record 1713: Phone is 330-747-8143")
	void PhoneOfRecord1713() {
		assertEquals("330-747-8143", customers.get(1712).getPhone());
	}

	@Test
	@DisplayName("Record 1713: Fax is 330-747-7661")
	void FaxOfRecord1713() {
		assertEquals("330-747-7661", customers.get(1712).getFax());
	}

	@Test
	@DisplayName("Record 1713: Email is dallas@drabek.com")
	void EmailOfRecord1713() {
		assertEquals("dallas@drabek.com", customers.get(1712).getEmail());
	}

	@Test
	@DisplayName("Record 1713: Web is http://www.dallasdrabek.com")
	void WebOfRecord1713() {
		assertEquals("http://www.dallasdrabek.com", customers.get(1712).getWeb());
	}
}
