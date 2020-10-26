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

@Tag("43")
class Record_884 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 884: FirstName is Lashonda")
	void FirstNameOfRecord884() {
		assertEquals("Lashonda", customers.get(883).getFirstName());
	}

	@Test
	@DisplayName("Record 884: LastName is Brzycki")
	void LastNameOfRecord884() {
		assertEquals("Brzycki", customers.get(883).getLastName());
	}

	@Test
	@DisplayName("Record 884: Company is Myers, Arnold B Esq")
	void CompanyOfRecord884() {
		assertEquals("Myers, Arnold B Esq", customers.get(883).getCompany());
	}

	@Test
	@DisplayName("Record 884: Address is 87 Glenbrook Rd")
	void AddressOfRecord884() {
		assertEquals("87 Glenbrook Rd", customers.get(883).getAddress());
	}

	@Test
	@DisplayName("Record 884: City is Stamford")
	void CityOfRecord884() {
		assertEquals("Stamford", customers.get(883).getCity());
	}

	@Test
	@DisplayName("Record 884: County is Fairfield")
	void CountyOfRecord884() {
		assertEquals("Fairfield", customers.get(883).getCounty());
	}

	@Test
	@DisplayName("Record 884: State is CT")
	void StateOfRecord884() {
		assertEquals("CT", customers.get(883).getState());
	}

	@Test
	@DisplayName("Record 884: ZIP is 6902")
	void ZIPOfRecord884() {
		assertEquals("6902", customers.get(883).getZIP());
	}

	@Test
	@DisplayName("Record 884: Phone is 203-351-0954")
	void PhoneOfRecord884() {
		assertEquals("203-351-0954", customers.get(883).getPhone());
	}

	@Test
	@DisplayName("Record 884: Fax is 203-351-7553")
	void FaxOfRecord884() {
		assertEquals("203-351-7553", customers.get(883).getFax());
	}

	@Test
	@DisplayName("Record 884: Email is lashonda@brzycki.com")
	void EmailOfRecord884() {
		assertEquals("lashonda@brzycki.com", customers.get(883).getEmail());
	}

	@Test
	@DisplayName("Record 884: Web is http://www.lashondabrzycki.com")
	void WebOfRecord884() {
		assertEquals("http://www.lashondabrzycki.com", customers.get(883).getWeb());
	}
}
