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

@Tag("24")
class Record_3655 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3655: FirstName is Matthew")
	void FirstNameOfRecord3655() {
		assertEquals("Matthew", customers.get(3654).getFirstName());
	}

	@Test
	@DisplayName("Record 3655: LastName is Judd")
	void LastNameOfRecord3655() {
		assertEquals("Judd", customers.get(3654).getLastName());
	}

	@Test
	@DisplayName("Record 3655: Company is Cassinis, Edward A Esq")
	void CompanyOfRecord3655() {
		assertEquals("Cassinis, Edward A Esq", customers.get(3654).getCompany());
	}

	@Test
	@DisplayName("Record 3655: Address is 502 E Linden St")
	void AddressOfRecord3655() {
		assertEquals("502 E Linden St", customers.get(3654).getAddress());
	}

	@Test
	@DisplayName("Record 3655: City is Abbotsford")
	void CityOfRecord3655() {
		assertEquals("Abbotsford", customers.get(3654).getCity());
	}

	@Test
	@DisplayName("Record 3655: County is Clark")
	void CountyOfRecord3655() {
		assertEquals("Clark", customers.get(3654).getCounty());
	}

	@Test
	@DisplayName("Record 3655: State is WI")
	void StateOfRecord3655() {
		assertEquals("WI", customers.get(3654).getState());
	}

	@Test
	@DisplayName("Record 3655: ZIP is 54405")
	void ZIPOfRecord3655() {
		assertEquals("54405", customers.get(3654).getZIP());
	}

	@Test
	@DisplayName("Record 3655: Phone is 715-223-7843")
	void PhoneOfRecord3655() {
		assertEquals("715-223-7843", customers.get(3654).getPhone());
	}

	@Test
	@DisplayName("Record 3655: Fax is 715-223-6033")
	void FaxOfRecord3655() {
		assertEquals("715-223-6033", customers.get(3654).getFax());
	}

	@Test
	@DisplayName("Record 3655: Email is matthew@judd.com")
	void EmailOfRecord3655() {
		assertEquals("matthew@judd.com", customers.get(3654).getEmail());
	}

	@Test
	@DisplayName("Record 3655: Web is http://www.matthewjudd.com")
	void WebOfRecord3655() {
		assertEquals("http://www.matthewjudd.com", customers.get(3654).getWeb());
	}
}
