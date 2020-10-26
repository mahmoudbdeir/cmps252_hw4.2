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

@Tag("19")
class Record_3160 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3160: FirstName is Florence")
	void FirstNameOfRecord3160() {
		assertEquals("Florence", customers.get(3159).getFirstName());
	}

	@Test
	@DisplayName("Record 3160: LastName is Perl")
	void LastNameOfRecord3160() {
		assertEquals("Perl", customers.get(3159).getLastName());
	}

	@Test
	@DisplayName("Record 3160: Company is Johnson, Mark A Esq")
	void CompanyOfRecord3160() {
		assertEquals("Johnson, Mark A Esq", customers.get(3159).getCompany());
	}

	@Test
	@DisplayName("Record 3160: Address is 1350 Main St")
	void AddressOfRecord3160() {
		assertEquals("1350 Main St", customers.get(3159).getAddress());
	}

	@Test
	@DisplayName("Record 3160: City is Springfield")
	void CityOfRecord3160() {
		assertEquals("Springfield", customers.get(3159).getCity());
	}

	@Test
	@DisplayName("Record 3160: County is Hampden")
	void CountyOfRecord3160() {
		assertEquals("Hampden", customers.get(3159).getCounty());
	}

	@Test
	@DisplayName("Record 3160: State is MA")
	void StateOfRecord3160() {
		assertEquals("MA", customers.get(3159).getState());
	}

	@Test
	@DisplayName("Record 3160: ZIP is 1103")
	void ZIPOfRecord3160() {
		assertEquals("1103", customers.get(3159).getZIP());
	}

	@Test
	@DisplayName("Record 3160: Phone is 413-739-0128")
	void PhoneOfRecord3160() {
		assertEquals("413-739-0128", customers.get(3159).getPhone());
	}

	@Test
	@DisplayName("Record 3160: Fax is 413-739-6799")
	void FaxOfRecord3160() {
		assertEquals("413-739-6799", customers.get(3159).getFax());
	}

	@Test
	@DisplayName("Record 3160: Email is florence@perl.com")
	void EmailOfRecord3160() {
		assertEquals("florence@perl.com", customers.get(3159).getEmail());
	}

	@Test
	@DisplayName("Record 3160: Web is http://www.florenceperl.com")
	void WebOfRecord3160() {
		assertEquals("http://www.florenceperl.com", customers.get(3159).getWeb());
	}
}
