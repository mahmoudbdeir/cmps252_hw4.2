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

@Tag("13")
class Record_2739 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2739: FirstName is Norma")
	void FirstNameOfRecord2739() {
		assertEquals("Norma", customers.get(2738).getFirstName());
	}

	@Test
	@DisplayName("Record 2739: LastName is Shrider")
	void LastNameOfRecord2739() {
		assertEquals("Shrider", customers.get(2738).getLastName());
	}

	@Test
	@DisplayName("Record 2739: Company is R Robles & Assoc")
	void CompanyOfRecord2739() {
		assertEquals("R Robles & Assoc", customers.get(2738).getCompany());
	}

	@Test
	@DisplayName("Record 2739: Address is 8421 N 29th St")
	void AddressOfRecord2739() {
		assertEquals("8421 N 29th St", customers.get(2738).getAddress());
	}

	@Test
	@DisplayName("Record 2739: City is Omaha")
	void CityOfRecord2739() {
		assertEquals("Omaha", customers.get(2738).getCity());
	}

	@Test
	@DisplayName("Record 2739: County is Douglas")
	void CountyOfRecord2739() {
		assertEquals("Douglas", customers.get(2738).getCounty());
	}

	@Test
	@DisplayName("Record 2739: State is NE")
	void StateOfRecord2739() {
		assertEquals("NE", customers.get(2738).getState());
	}

	@Test
	@DisplayName("Record 2739: ZIP is 68112")
	void ZIPOfRecord2739() {
		assertEquals("68112", customers.get(2738).getZIP());
	}

	@Test
	@DisplayName("Record 2739: Phone is 402-452-6732")
	void PhoneOfRecord2739() {
		assertEquals("402-452-6732", customers.get(2738).getPhone());
	}

	@Test
	@DisplayName("Record 2739: Fax is 402-452-9012")
	void FaxOfRecord2739() {
		assertEquals("402-452-9012", customers.get(2738).getFax());
	}

	@Test
	@DisplayName("Record 2739: Email is norma@shrider.com")
	void EmailOfRecord2739() {
		assertEquals("norma@shrider.com", customers.get(2738).getEmail());
	}

	@Test
	@DisplayName("Record 2739: Web is http://www.normashrider.com")
	void WebOfRecord2739() {
		assertEquals("http://www.normashrider.com", customers.get(2738).getWeb());
	}
}
