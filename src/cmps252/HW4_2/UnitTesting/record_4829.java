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
class Record_4829 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4829: FirstName is Wilmer")
	void FirstNameOfRecord4829() {
		assertEquals("Wilmer", customers.get(4828).getFirstName());
	}

	@Test
	@DisplayName("Record 4829: LastName is Strohbehn")
	void LastNameOfRecord4829() {
		assertEquals("Strohbehn", customers.get(4828).getLastName());
	}

	@Test
	@DisplayName("Record 4829: Company is Johnson, Norma S Esq")
	void CompanyOfRecord4829() {
		assertEquals("Johnson, Norma S Esq", customers.get(4828).getCompany());
	}

	@Test
	@DisplayName("Record 4829: Address is 5605 Monroe St")
	void AddressOfRecord4829() {
		assertEquals("5605 Monroe St", customers.get(4828).getAddress());
	}

	@Test
	@DisplayName("Record 4829: City is Sylvania")
	void CityOfRecord4829() {
		assertEquals("Sylvania", customers.get(4828).getCity());
	}

	@Test
	@DisplayName("Record 4829: County is Lucas")
	void CountyOfRecord4829() {
		assertEquals("Lucas", customers.get(4828).getCounty());
	}

	@Test
	@DisplayName("Record 4829: State is OH")
	void StateOfRecord4829() {
		assertEquals("OH", customers.get(4828).getState());
	}

	@Test
	@DisplayName("Record 4829: ZIP is 43560")
	void ZIPOfRecord4829() {
		assertEquals("43560", customers.get(4828).getZIP());
	}

	@Test
	@DisplayName("Record 4829: Phone is 419-882-8532")
	void PhoneOfRecord4829() {
		assertEquals("419-882-8532", customers.get(4828).getPhone());
	}

	@Test
	@DisplayName("Record 4829: Fax is 419-882-8787")
	void FaxOfRecord4829() {
		assertEquals("419-882-8787", customers.get(4828).getFax());
	}

	@Test
	@DisplayName("Record 4829: Email is wilmer@strohbehn.com")
	void EmailOfRecord4829() {
		assertEquals("wilmer@strohbehn.com", customers.get(4828).getEmail());
	}

	@Test
	@DisplayName("Record 4829: Web is http://www.wilmerstrohbehn.com")
	void WebOfRecord4829() {
		assertEquals("http://www.wilmerstrohbehn.com", customers.get(4828).getWeb());
	}
}
