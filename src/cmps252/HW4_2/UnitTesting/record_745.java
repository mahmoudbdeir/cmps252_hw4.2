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
class Record_745 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 745: FirstName is Goldie")
	void FirstNameOfRecord745() {
		assertEquals("Goldie", customers.get(744).getFirstName());
	}

	@Test
	@DisplayName("Record 745: LastName is Gabrielli")
	void LastNameOfRecord745() {
		assertEquals("Gabrielli", customers.get(744).getLastName());
	}

	@Test
	@DisplayName("Record 745: Company is Post Office Plus")
	void CompanyOfRecord745() {
		assertEquals("Post Office Plus", customers.get(744).getCompany());
	}

	@Test
	@DisplayName("Record 745: Address is 11000 Cedar Ave")
	void AddressOfRecord745() {
		assertEquals("11000 Cedar Ave", customers.get(744).getAddress());
	}

	@Test
	@DisplayName("Record 745: City is Cleveland")
	void CityOfRecord745() {
		assertEquals("Cleveland", customers.get(744).getCity());
	}

	@Test
	@DisplayName("Record 745: County is Cuyahoga")
	void CountyOfRecord745() {
		assertEquals("Cuyahoga", customers.get(744).getCounty());
	}

	@Test
	@DisplayName("Record 745: State is OH")
	void StateOfRecord745() {
		assertEquals("OH", customers.get(744).getState());
	}

	@Test
	@DisplayName("Record 745: ZIP is 44106")
	void ZIPOfRecord745() {
		assertEquals("44106", customers.get(744).getZIP());
	}

	@Test
	@DisplayName("Record 745: Phone is 216-421-6836")
	void PhoneOfRecord745() {
		assertEquals("216-421-6836", customers.get(744).getPhone());
	}

	@Test
	@DisplayName("Record 745: Fax is 216-421-2827")
	void FaxOfRecord745() {
		assertEquals("216-421-2827", customers.get(744).getFax());
	}

	@Test
	@DisplayName("Record 745: Email is goldie@gabrielli.com")
	void EmailOfRecord745() {
		assertEquals("goldie@gabrielli.com", customers.get(744).getEmail());
	}

	@Test
	@DisplayName("Record 745: Web is http://www.goldiegabrielli.com")
	void WebOfRecord745() {
		assertEquals("http://www.goldiegabrielli.com", customers.get(744).getWeb());
	}
}
