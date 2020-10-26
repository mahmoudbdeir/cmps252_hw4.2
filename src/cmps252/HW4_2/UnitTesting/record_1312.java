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

@Tag("15")
class Record_1312 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1312: FirstName is Abe")
	void FirstNameOfRecord1312() {
		assertEquals("Abe", customers.get(1311).getFirstName());
	}

	@Test
	@DisplayName("Record 1312: LastName is Lacaille")
	void LastNameOfRecord1312() {
		assertEquals("Lacaille", customers.get(1311).getLastName());
	}

	@Test
	@DisplayName("Record 1312: Company is Chanticleer Restaurant")
	void CompanyOfRecord1312() {
		assertEquals("Chanticleer Restaurant", customers.get(1311).getCompany());
	}

	@Test
	@DisplayName("Record 1312: Address is 2715 19th Arrctic")
	void AddressOfRecord1312() {
		assertEquals("2715 19th Arrctic", customers.get(1311).getAddress());
	}

	@Test
	@DisplayName("Record 1312: City is Atlantic City")
	void CityOfRecord1312() {
		assertEquals("Atlantic City", customers.get(1311).getCity());
	}

	@Test
	@DisplayName("Record 1312: County is Atlantic")
	void CountyOfRecord1312() {
		assertEquals("Atlantic", customers.get(1311).getCounty());
	}

	@Test
	@DisplayName("Record 1312: State is NJ")
	void StateOfRecord1312() {
		assertEquals("NJ", customers.get(1311).getState());
	}

	@Test
	@DisplayName("Record 1312: ZIP is 8401")
	void ZIPOfRecord1312() {
		assertEquals("8401", customers.get(1311).getZIP());
	}

	@Test
	@DisplayName("Record 1312: Phone is 609-345-3651")
	void PhoneOfRecord1312() {
		assertEquals("609-345-3651", customers.get(1311).getPhone());
	}

	@Test
	@DisplayName("Record 1312: Fax is 609-345-3342")
	void FaxOfRecord1312() {
		assertEquals("609-345-3342", customers.get(1311).getFax());
	}

	@Test
	@DisplayName("Record 1312: Email is abe@lacaille.com")
	void EmailOfRecord1312() {
		assertEquals("abe@lacaille.com", customers.get(1311).getEmail());
	}

	@Test
	@DisplayName("Record 1312: Web is http://www.abelacaille.com")
	void WebOfRecord1312() {
		assertEquals("http://www.abelacaille.com", customers.get(1311).getWeb());
	}
}
