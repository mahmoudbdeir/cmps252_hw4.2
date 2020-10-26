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
class Record_1335 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1335: FirstName is Kelli")
	void FirstNameOfRecord1335() {
		assertEquals("Kelli", customers.get(1334).getFirstName());
	}

	@Test
	@DisplayName("Record 1335: LastName is Bissen")
	void LastNameOfRecord1335() {
		assertEquals("Bissen", customers.get(1334).getLastName());
	}

	@Test
	@DisplayName("Record 1335: Company is National Skeet Shooting Assn")
	void CompanyOfRecord1335() {
		assertEquals("National Skeet Shooting Assn", customers.get(1334).getCompany());
	}

	@Test
	@DisplayName("Record 1335: Address is 3650 Austin Bluffs Pky  #-138")
	void AddressOfRecord1335() {
		assertEquals("3650 Austin Bluffs Pky  #-138", customers.get(1334).getAddress());
	}

	@Test
	@DisplayName("Record 1335: City is Colorado Springs")
	void CityOfRecord1335() {
		assertEquals("Colorado Springs", customers.get(1334).getCity());
	}

	@Test
	@DisplayName("Record 1335: County is El Paso")
	void CountyOfRecord1335() {
		assertEquals("El Paso", customers.get(1334).getCounty());
	}

	@Test
	@DisplayName("Record 1335: State is CO")
	void StateOfRecord1335() {
		assertEquals("CO", customers.get(1334).getState());
	}

	@Test
	@DisplayName("Record 1335: ZIP is 80918")
	void ZIPOfRecord1335() {
		assertEquals("80918", customers.get(1334).getZIP());
	}

	@Test
	@DisplayName("Record 1335: Phone is 719-548-9127")
	void PhoneOfRecord1335() {
		assertEquals("719-548-9127", customers.get(1334).getPhone());
	}

	@Test
	@DisplayName("Record 1335: Fax is 719-548-8207")
	void FaxOfRecord1335() {
		assertEquals("719-548-8207", customers.get(1334).getFax());
	}

	@Test
	@DisplayName("Record 1335: Email is kelli@bissen.com")
	void EmailOfRecord1335() {
		assertEquals("kelli@bissen.com", customers.get(1334).getEmail());
	}

	@Test
	@DisplayName("Record 1335: Web is http://www.kellibissen.com")
	void WebOfRecord1335() {
		assertEquals("http://www.kellibissen.com", customers.get(1334).getWeb());
	}
}
