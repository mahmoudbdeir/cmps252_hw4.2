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
class Record_4243 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4243: FirstName is Bettye")
	void FirstNameOfRecord4243() {
		assertEquals("Bettye", customers.get(4242).getFirstName());
	}

	@Test
	@DisplayName("Record 4243: LastName is Bonier")
	void LastNameOfRecord4243() {
		assertEquals("Bonier", customers.get(4242).getLastName());
	}

	@Test
	@DisplayName("Record 4243: Company is Biggs, Jan M Esq")
	void CompanyOfRecord4243() {
		assertEquals("Biggs, Jan M Esq", customers.get(4242).getCompany());
	}

	@Test
	@DisplayName("Record 4243: Address is 133 W Cerritos Ave")
	void AddressOfRecord4243() {
		assertEquals("133 W Cerritos Ave", customers.get(4242).getAddress());
	}

	@Test
	@DisplayName("Record 4243: City is Anahym")
	void CityOfRecord4243() {
		assertEquals("Anahym", customers.get(4242).getCity());
	}

	@Test
	@DisplayName("Record 4243: County is Orange")
	void CountyOfRecord4243() {
		assertEquals("Orange", customers.get(4242).getCounty());
	}

	@Test
	@DisplayName("Record 4243: State is CA")
	void StateOfRecord4243() {
		assertEquals("CA", customers.get(4242).getState());
	}

	@Test
	@DisplayName("Record 4243: ZIP is 92805")
	void ZIPOfRecord4243() {
		assertEquals("92805", customers.get(4242).getZIP());
	}

	@Test
	@DisplayName("Record 4243: Phone is 714-991-4844")
	void PhoneOfRecord4243() {
		assertEquals("714-991-4844", customers.get(4242).getPhone());
	}

	@Test
	@DisplayName("Record 4243: Fax is 714-991-1431")
	void FaxOfRecord4243() {
		assertEquals("714-991-1431", customers.get(4242).getFax());
	}

	@Test
	@DisplayName("Record 4243: Email is bettye@bonier.com")
	void EmailOfRecord4243() {
		assertEquals("bettye@bonier.com", customers.get(4242).getEmail());
	}

	@Test
	@DisplayName("Record 4243: Web is http://www.bettyebonier.com")
	void WebOfRecord4243() {
		assertEquals("http://www.bettyebonier.com", customers.get(4242).getWeb());
	}
}
