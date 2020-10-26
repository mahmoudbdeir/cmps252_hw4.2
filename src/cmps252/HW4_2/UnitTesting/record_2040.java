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
class Record_2040 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2040: FirstName is Bernardo")
	void FirstNameOfRecord2040() {
		assertEquals("Bernardo", customers.get(2039).getFirstName());
	}

	@Test
	@DisplayName("Record 2040: LastName is Aleem")
	void LastNameOfRecord2040() {
		assertEquals("Aleem", customers.get(2039).getLastName());
	}

	@Test
	@DisplayName("Record 2040: Company is Wert, W Scott Esq")
	void CompanyOfRecord2040() {
		assertEquals("Wert, W Scott Esq", customers.get(2039).getCompany());
	}

	@Test
	@DisplayName("Record 2040: Address is 8932 State Route 14")
	void AddressOfRecord2040() {
		assertEquals("8932 State Route 14", customers.get(2039).getAddress());
	}

	@Test
	@DisplayName("Record 2040: City is Streetsboro")
	void CityOfRecord2040() {
		assertEquals("Streetsboro", customers.get(2039).getCity());
	}

	@Test
	@DisplayName("Record 2040: County is Portage")
	void CountyOfRecord2040() {
		assertEquals("Portage", customers.get(2039).getCounty());
	}

	@Test
	@DisplayName("Record 2040: State is OH")
	void StateOfRecord2040() {
		assertEquals("OH", customers.get(2039).getState());
	}

	@Test
	@DisplayName("Record 2040: ZIP is 44241")
	void ZIPOfRecord2040() {
		assertEquals("44241", customers.get(2039).getZIP());
	}

	@Test
	@DisplayName("Record 2040: Phone is 330-626-7840")
	void PhoneOfRecord2040() {
		assertEquals("330-626-7840", customers.get(2039).getPhone());
	}

	@Test
	@DisplayName("Record 2040: Fax is 330-626-5529")
	void FaxOfRecord2040() {
		assertEquals("330-626-5529", customers.get(2039).getFax());
	}

	@Test
	@DisplayName("Record 2040: Email is bernardo@aleem.com")
	void EmailOfRecord2040() {
		assertEquals("bernardo@aleem.com", customers.get(2039).getEmail());
	}

	@Test
	@DisplayName("Record 2040: Web is http://www.bernardoaleem.com")
	void WebOfRecord2040() {
		assertEquals("http://www.bernardoaleem.com", customers.get(2039).getWeb());
	}
}
