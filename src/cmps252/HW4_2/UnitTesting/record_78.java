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
class Record_78 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 78: FirstName is Lea")
	void FirstNameOfRecord78() {
		assertEquals("Lea", customers.get(77).getFirstName());
	}

	@Test
	@DisplayName("Record 78: LastName is Picado")
	void LastNameOfRecord78() {
		assertEquals("Picado", customers.get(77).getLastName());
	}

	@Test
	@DisplayName("Record 78: Company is Seward Life Action Council")
	void CompanyOfRecord78() {
		assertEquals("Seward Life Action Council", customers.get(77).getCompany());
	}

	@Test
	@DisplayName("Record 78: Address is 2385 Hammond Dr")
	void AddressOfRecord78() {
		assertEquals("2385 Hammond Dr", customers.get(77).getAddress());
	}

	@Test
	@DisplayName("Record 78: City is Schaumburg")
	void CityOfRecord78() {
		assertEquals("Schaumburg", customers.get(77).getCity());
	}

	@Test
	@DisplayName("Record 78: County is Cook")
	void CountyOfRecord78() {
		assertEquals("Cook", customers.get(77).getCounty());
	}

	@Test
	@DisplayName("Record 78: State is IL")
	void StateOfRecord78() {
		assertEquals("IL", customers.get(77).getState());
	}

	@Test
	@DisplayName("Record 78: ZIP is 60173")
	void ZIPOfRecord78() {
		assertEquals("60173", customers.get(77).getZIP());
	}

	@Test
	@DisplayName("Record 78: Phone is 847-925-6382")
	void PhoneOfRecord78() {
		assertEquals("847-925-6382", customers.get(77).getPhone());
	}

	@Test
	@DisplayName("Record 78: Fax is 847-925-2144")
	void FaxOfRecord78() {
		assertEquals("847-925-2144", customers.get(77).getFax());
	}

	@Test
	@DisplayName("Record 78: Email is lea@picado.com")
	void EmailOfRecord78() {
		assertEquals("lea@picado.com", customers.get(77).getEmail());
	}

	@Test
	@DisplayName("Record 78: Web is http://www.leapicado.com")
	void WebOfRecord78() {
		assertEquals("http://www.leapicado.com", customers.get(77).getWeb());
	}
}
