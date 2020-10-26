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

@Tag("0")
class Record_3297 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3297: FirstName is Augustus")
	void FirstNameOfRecord3297() {
		assertEquals("Augustus", customers.get(3296).getFirstName());
	}

	@Test
	@DisplayName("Record 3297: LastName is Minott")
	void LastNameOfRecord3297() {
		assertEquals("Minott", customers.get(3296).getLastName());
	}

	@Test
	@DisplayName("Record 3297: Company is Lorusso & Loud")
	void CompanyOfRecord3297() {
		assertEquals("Lorusso & Loud", customers.get(3296).getCompany());
	}

	@Test
	@DisplayName("Record 3297: Address is 7207 Chagrin Rd  #-8")
	void AddressOfRecord3297() {
		assertEquals("7207 Chagrin Rd  #-8", customers.get(3296).getAddress());
	}

	@Test
	@DisplayName("Record 3297: City is Chagrin Falls")
	void CityOfRecord3297() {
		assertEquals("Chagrin Falls", customers.get(3296).getCity());
	}

	@Test
	@DisplayName("Record 3297: County is Geauga")
	void CountyOfRecord3297() {
		assertEquals("Geauga", customers.get(3296).getCounty());
	}

	@Test
	@DisplayName("Record 3297: State is OH")
	void StateOfRecord3297() {
		assertEquals("OH", customers.get(3296).getState());
	}

	@Test
	@DisplayName("Record 3297: ZIP is 44023")
	void ZIPOfRecord3297() {
		assertEquals("44023", customers.get(3296).getZIP());
	}

	@Test
	@DisplayName("Record 3297: Phone is 440-247-2820")
	void PhoneOfRecord3297() {
		assertEquals("440-247-2820", customers.get(3296).getPhone());
	}

	@Test
	@DisplayName("Record 3297: Fax is 440-247-9656")
	void FaxOfRecord3297() {
		assertEquals("440-247-9656", customers.get(3296).getFax());
	}

	@Test
	@DisplayName("Record 3297: Email is augustus@minott.com")
	void EmailOfRecord3297() {
		assertEquals("augustus@minott.com", customers.get(3296).getEmail());
	}

	@Test
	@DisplayName("Record 3297: Web is http://www.augustusminott.com")
	void WebOfRecord3297() {
		assertEquals("http://www.augustusminott.com", customers.get(3296).getWeb());
	}
}
