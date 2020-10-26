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

@Tag("13")
class Record_1334 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1334: FirstName is Kirsten")
	void FirstNameOfRecord1334() {
		assertEquals("Kirsten", customers.get(1333).getFirstName());
	}

	@Test
	@DisplayName("Record 1334: LastName is Swinger")
	void LastNameOfRecord1334() {
		assertEquals("Swinger", customers.get(1333).getLastName());
	}

	@Test
	@DisplayName("Record 1334: Company is Custom Color Inc")
	void CompanyOfRecord1334() {
		assertEquals("Custom Color Inc", customers.get(1333).getCompany());
	}

	@Test
	@DisplayName("Record 1334: Address is 107 Legrande Blvd")
	void AddressOfRecord1334() {
		assertEquals("107 Legrande Blvd", customers.get(1333).getAddress());
	}

	@Test
	@DisplayName("Record 1334: City is Greenville")
	void CityOfRecord1334() {
		assertEquals("Greenville", customers.get(1333).getCity());
	}

	@Test
	@DisplayName("Record 1334: County is Greenville")
	void CountyOfRecord1334() {
		assertEquals("Greenville", customers.get(1333).getCounty());
	}

	@Test
	@DisplayName("Record 1334: State is SC")
	void StateOfRecord1334() {
		assertEquals("SC", customers.get(1333).getState());
	}

	@Test
	@DisplayName("Record 1334: ZIP is 29607")
	void ZIPOfRecord1334() {
		assertEquals("29607", customers.get(1333).getZIP());
	}

	@Test
	@DisplayName("Record 1334: Phone is 864-232-3844")
	void PhoneOfRecord1334() {
		assertEquals("864-232-3844", customers.get(1333).getPhone());
	}

	@Test
	@DisplayName("Record 1334: Fax is 864-232-2313")
	void FaxOfRecord1334() {
		assertEquals("864-232-2313", customers.get(1333).getFax());
	}

	@Test
	@DisplayName("Record 1334: Email is kirsten@swinger.com")
	void EmailOfRecord1334() {
		assertEquals("kirsten@swinger.com", customers.get(1333).getEmail());
	}

	@Test
	@DisplayName("Record 1334: Web is http://www.kirstenswinger.com")
	void WebOfRecord1334() {
		assertEquals("http://www.kirstenswinger.com", customers.get(1333).getWeb());
	}
}
