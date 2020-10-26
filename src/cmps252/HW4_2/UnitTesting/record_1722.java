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
class Record_1722 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1722: FirstName is Joe")
	void FirstNameOfRecord1722() {
		assertEquals("Joe", customers.get(1721).getFirstName());
	}

	@Test
	@DisplayName("Record 1722: LastName is Charpentier")
	void LastNameOfRecord1722() {
		assertEquals("Charpentier", customers.get(1721).getLastName());
	}

	@Test
	@DisplayName("Record 1722: Company is Harman, Susan M Esq")
	void CompanyOfRecord1722() {
		assertEquals("Harman, Susan M Esq", customers.get(1721).getCompany());
	}

	@Test
	@DisplayName("Record 1722: Address is 500 Morris Ave")
	void AddressOfRecord1722() {
		assertEquals("500 Morris Ave", customers.get(1721).getAddress());
	}

	@Test
	@DisplayName("Record 1722: City is Springfield")
	void CityOfRecord1722() {
		assertEquals("Springfield", customers.get(1721).getCity());
	}

	@Test
	@DisplayName("Record 1722: County is Union")
	void CountyOfRecord1722() {
		assertEquals("Union", customers.get(1721).getCounty());
	}

	@Test
	@DisplayName("Record 1722: State is NJ")
	void StateOfRecord1722() {
		assertEquals("NJ", customers.get(1721).getState());
	}

	@Test
	@DisplayName("Record 1722: ZIP is 7081")
	void ZIPOfRecord1722() {
		assertEquals("7081", customers.get(1721).getZIP());
	}

	@Test
	@DisplayName("Record 1722: Phone is 973-467-2712")
	void PhoneOfRecord1722() {
		assertEquals("973-467-2712", customers.get(1721).getPhone());
	}

	@Test
	@DisplayName("Record 1722: Fax is 973-467-9101")
	void FaxOfRecord1722() {
		assertEquals("973-467-9101", customers.get(1721).getFax());
	}

	@Test
	@DisplayName("Record 1722: Email is joe@charpentier.com")
	void EmailOfRecord1722() {
		assertEquals("joe@charpentier.com", customers.get(1721).getEmail());
	}

	@Test
	@DisplayName("Record 1722: Web is http://www.joecharpentier.com")
	void WebOfRecord1722() {
		assertEquals("http://www.joecharpentier.com", customers.get(1721).getWeb());
	}
}
