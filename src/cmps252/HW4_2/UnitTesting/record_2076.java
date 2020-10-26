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

@Tag("45")
class Record_2076 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2076: FirstName is Kendra")
	void FirstNameOfRecord2076() {
		assertEquals("Kendra", customers.get(2075).getFirstName());
	}

	@Test
	@DisplayName("Record 2076: LastName is Stribble")
	void LastNameOfRecord2076() {
		assertEquals("Stribble", customers.get(2075).getLastName());
	}

	@Test
	@DisplayName("Record 2076: Company is Setty, S Lata Esq")
	void CompanyOfRecord2076() {
		assertEquals("Setty, S Lata Esq", customers.get(2075).getCompany());
	}

	@Test
	@DisplayName("Record 2076: Address is 14151 Irving Ave")
	void AddressOfRecord2076() {
		assertEquals("14151 Irving Ave", customers.get(2075).getAddress());
	}

	@Test
	@DisplayName("Record 2076: City is Dolton")
	void CityOfRecord2076() {
		assertEquals("Dolton", customers.get(2075).getCity());
	}

	@Test
	@DisplayName("Record 2076: County is Cook")
	void CountyOfRecord2076() {
		assertEquals("Cook", customers.get(2075).getCounty());
	}

	@Test
	@DisplayName("Record 2076: State is IL")
	void StateOfRecord2076() {
		assertEquals("IL", customers.get(2075).getState());
	}

	@Test
	@DisplayName("Record 2076: ZIP is 60419")
	void ZIPOfRecord2076() {
		assertEquals("60419", customers.get(2075).getZIP());
	}

	@Test
	@DisplayName("Record 2076: Phone is 708-841-8421")
	void PhoneOfRecord2076() {
		assertEquals("708-841-8421", customers.get(2075).getPhone());
	}

	@Test
	@DisplayName("Record 2076: Fax is 708-841-2068")
	void FaxOfRecord2076() {
		assertEquals("708-841-2068", customers.get(2075).getFax());
	}

	@Test
	@DisplayName("Record 2076: Email is kendra@stribble.com")
	void EmailOfRecord2076() {
		assertEquals("kendra@stribble.com", customers.get(2075).getEmail());
	}

	@Test
	@DisplayName("Record 2076: Web is http://www.kendrastribble.com")
	void WebOfRecord2076() {
		assertEquals("http://www.kendrastribble.com", customers.get(2075).getWeb());
	}
}
