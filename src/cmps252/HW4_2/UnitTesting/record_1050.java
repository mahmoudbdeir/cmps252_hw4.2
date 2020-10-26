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
class Record_1050 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1050: FirstName is Harriet")
	void FirstNameOfRecord1050() {
		assertEquals("Harriet", customers.get(1049).getFirstName());
	}

	@Test
	@DisplayName("Record 1050: LastName is Screws")
	void LastNameOfRecord1050() {
		assertEquals("Screws", customers.get(1049).getLastName());
	}

	@Test
	@DisplayName("Record 1050: Company is Baronsky, Robert Esq")
	void CompanyOfRecord1050() {
		assertEquals("Baronsky, Robert Esq", customers.get(1049).getCompany());
	}

	@Test
	@DisplayName("Record 1050: Address is 155 N Michigan Ave")
	void AddressOfRecord1050() {
		assertEquals("155 N Michigan Ave", customers.get(1049).getAddress());
	}

	@Test
	@DisplayName("Record 1050: City is Chicago")
	void CityOfRecord1050() {
		assertEquals("Chicago", customers.get(1049).getCity());
	}

	@Test
	@DisplayName("Record 1050: County is Cook")
	void CountyOfRecord1050() {
		assertEquals("Cook", customers.get(1049).getCounty());
	}

	@Test
	@DisplayName("Record 1050: State is IL")
	void StateOfRecord1050() {
		assertEquals("IL", customers.get(1049).getState());
	}

	@Test
	@DisplayName("Record 1050: ZIP is 60601")
	void ZIPOfRecord1050() {
		assertEquals("60601", customers.get(1049).getZIP());
	}

	@Test
	@DisplayName("Record 1050: Phone is 312-819-9914")
	void PhoneOfRecord1050() {
		assertEquals("312-819-9914", customers.get(1049).getPhone());
	}

	@Test
	@DisplayName("Record 1050: Fax is 312-819-8142")
	void FaxOfRecord1050() {
		assertEquals("312-819-8142", customers.get(1049).getFax());
	}

	@Test
	@DisplayName("Record 1050: Email is harriet@screws.com")
	void EmailOfRecord1050() {
		assertEquals("harriet@screws.com", customers.get(1049).getEmail());
	}

	@Test
	@DisplayName("Record 1050: Web is http://www.harrietscrews.com")
	void WebOfRecord1050() {
		assertEquals("http://www.harrietscrews.com", customers.get(1049).getWeb());
	}
}
