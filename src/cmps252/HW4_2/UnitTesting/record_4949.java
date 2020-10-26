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

@Tag("44")
class Record_4949 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4949: FirstName is Ezra")
	void FirstNameOfRecord4949() {
		assertEquals("Ezra", customers.get(4948).getFirstName());
	}

	@Test
	@DisplayName("Record 4949: LastName is Albelo")
	void LastNameOfRecord4949() {
		assertEquals("Albelo", customers.get(4948).getLastName());
	}

	@Test
	@DisplayName("Record 4949: Company is Unity Fellowship Center")
	void CompanyOfRecord4949() {
		assertEquals("Unity Fellowship Center", customers.get(4948).getCompany());
	}

	@Test
	@DisplayName("Record 4949: Address is 3059 Umi St")
	void AddressOfRecord4949() {
		assertEquals("3059 Umi St", customers.get(4948).getAddress());
	}

	@Test
	@DisplayName("Record 4949: City is Lihue")
	void CityOfRecord4949() {
		assertEquals("Lihue", customers.get(4948).getCity());
	}

	@Test
	@DisplayName("Record 4949: County is Kauai")
	void CountyOfRecord4949() {
		assertEquals("Kauai", customers.get(4948).getCounty());
	}

	@Test
	@DisplayName("Record 4949: State is HI")
	void StateOfRecord4949() {
		assertEquals("HI", customers.get(4948).getState());
	}

	@Test
	@DisplayName("Record 4949: ZIP is 96766")
	void ZIPOfRecord4949() {
		assertEquals("96766", customers.get(4948).getZIP());
	}

	@Test
	@DisplayName("Record 4949: Phone is 808-246-1114")
	void PhoneOfRecord4949() {
		assertEquals("808-246-1114", customers.get(4948).getPhone());
	}

	@Test
	@DisplayName("Record 4949: Fax is 808-246-7272")
	void FaxOfRecord4949() {
		assertEquals("808-246-7272", customers.get(4948).getFax());
	}

	@Test
	@DisplayName("Record 4949: Email is ezra@albelo.com")
	void EmailOfRecord4949() {
		assertEquals("ezra@albelo.com", customers.get(4948).getEmail());
	}

	@Test
	@DisplayName("Record 4949: Web is http://www.ezraalbelo.com")
	void WebOfRecord4949() {
		assertEquals("http://www.ezraalbelo.com", customers.get(4948).getWeb());
	}
}
