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

@Tag("4")
class Record_3347 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3347: FirstName is Ben")
	void FirstNameOfRecord3347() {
		assertEquals("Ben", customers.get(3346).getFirstName());
	}

	@Test
	@DisplayName("Record 3347: LastName is Olivarez")
	void LastNameOfRecord3347() {
		assertEquals("Olivarez", customers.get(3346).getLastName());
	}

	@Test
	@DisplayName("Record 3347: Company is Santa Clara Gifts & Stationers")
	void CompanyOfRecord3347() {
		assertEquals("Santa Clara Gifts & Stationers", customers.get(3346).getCompany());
	}

	@Test
	@DisplayName("Record 3347: Address is 2859 Aaronwood Ave Ne")
	void AddressOfRecord3347() {
		assertEquals("2859 Aaronwood Ave Ne", customers.get(3346).getAddress());
	}

	@Test
	@DisplayName("Record 3347: City is Massillon")
	void CityOfRecord3347() {
		assertEquals("Massillon", customers.get(3346).getCity());
	}

	@Test
	@DisplayName("Record 3347: County is Stark")
	void CountyOfRecord3347() {
		assertEquals("Stark", customers.get(3346).getCounty());
	}

	@Test
	@DisplayName("Record 3347: State is OH")
	void StateOfRecord3347() {
		assertEquals("OH", customers.get(3346).getState());
	}

	@Test
	@DisplayName("Record 3347: ZIP is 44646")
	void ZIPOfRecord3347() {
		assertEquals("44646", customers.get(3346).getZIP());
	}

	@Test
	@DisplayName("Record 3347: Phone is 330-832-6543")
	void PhoneOfRecord3347() {
		assertEquals("330-832-6543", customers.get(3346).getPhone());
	}

	@Test
	@DisplayName("Record 3347: Fax is 330-832-9264")
	void FaxOfRecord3347() {
		assertEquals("330-832-9264", customers.get(3346).getFax());
	}

	@Test
	@DisplayName("Record 3347: Email is ben@olivarez.com")
	void EmailOfRecord3347() {
		assertEquals("ben@olivarez.com", customers.get(3346).getEmail());
	}

	@Test
	@DisplayName("Record 3347: Web is http://www.benolivarez.com")
	void WebOfRecord3347() {
		assertEquals("http://www.benolivarez.com", customers.get(3346).getWeb());
	}
}
