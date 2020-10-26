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

@Tag("36")
class Record_4621 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4621: FirstName is Isabelle")
	void FirstNameOfRecord4621() {
		assertEquals("Isabelle", customers.get(4620).getFirstName());
	}

	@Test
	@DisplayName("Record 4621: LastName is Calvi")
	void LastNameOfRecord4621() {
		assertEquals("Calvi", customers.get(4620).getLastName());
	}

	@Test
	@DisplayName("Record 4621: Company is Flame Spray Inc")
	void CompanyOfRecord4621() {
		assertEquals("Flame Spray Inc", customers.get(4620).getCompany());
	}

	@Test
	@DisplayName("Record 4621: Address is 428 A Kelley Dr")
	void AddressOfRecord4621() {
		assertEquals("428 A Kelley Dr", customers.get(4620).getAddress());
	}

	@Test
	@DisplayName("Record 4621: City is Berlin")
	void CityOfRecord4621() {
		assertEquals("Berlin", customers.get(4620).getCity());
	}

	@Test
	@DisplayName("Record 4621: County is Camden")
	void CountyOfRecord4621() {
		assertEquals("Camden", customers.get(4620).getCounty());
	}

	@Test
	@DisplayName("Record 4621: State is NJ")
	void StateOfRecord4621() {
		assertEquals("NJ", customers.get(4620).getState());
	}

	@Test
	@DisplayName("Record 4621: ZIP is 8009")
	void ZIPOfRecord4621() {
		assertEquals("8009", customers.get(4620).getZIP());
	}

	@Test
	@DisplayName("Record 4621: Phone is 856-767-2301")
	void PhoneOfRecord4621() {
		assertEquals("856-767-2301", customers.get(4620).getPhone());
	}

	@Test
	@DisplayName("Record 4621: Fax is 856-767-4033")
	void FaxOfRecord4621() {
		assertEquals("856-767-4033", customers.get(4620).getFax());
	}

	@Test
	@DisplayName("Record 4621: Email is isabelle@calvi.com")
	void EmailOfRecord4621() {
		assertEquals("isabelle@calvi.com", customers.get(4620).getEmail());
	}

	@Test
	@DisplayName("Record 4621: Web is http://www.isabellecalvi.com")
	void WebOfRecord4621() {
		assertEquals("http://www.isabellecalvi.com", customers.get(4620).getWeb());
	}
}
