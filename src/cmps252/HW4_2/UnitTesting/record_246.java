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

@Tag("28")
class Record_246 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 246: FirstName is Tory")
	void FirstNameOfRecord246() {
		assertEquals("Tory", customers.get(245).getFirstName());
	}

	@Test
	@DisplayName("Record 246: LastName is Wank")
	void LastNameOfRecord246() {
		assertEquals("Wank", customers.get(245).getLastName());
	}

	@Test
	@DisplayName("Record 246: Company is Miller, Philip G Esq")
	void CompanyOfRecord246() {
		assertEquals("Miller, Philip G Esq", customers.get(245).getCompany());
	}

	@Test
	@DisplayName("Record 246: Address is 1108 N Glenn Rd")
	void AddressOfRecord246() {
		assertEquals("1108 N Glenn Rd", customers.get(245).getAddress());
	}

	@Test
	@DisplayName("Record 246: City is Casper")
	void CityOfRecord246() {
		assertEquals("Casper", customers.get(245).getCity());
	}

	@Test
	@DisplayName("Record 246: County is Natrona")
	void CountyOfRecord246() {
		assertEquals("Natrona", customers.get(245).getCounty());
	}

	@Test
	@DisplayName("Record 246: State is WY")
	void StateOfRecord246() {
		assertEquals("WY", customers.get(245).getState());
	}

	@Test
	@DisplayName("Record 246: ZIP is 82601")
	void ZIPOfRecord246() {
		assertEquals("82601", customers.get(245).getZIP());
	}

	@Test
	@DisplayName("Record 246: Phone is 307-577-7435")
	void PhoneOfRecord246() {
		assertEquals("307-577-7435", customers.get(245).getPhone());
	}

	@Test
	@DisplayName("Record 246: Fax is 307-577-5382")
	void FaxOfRecord246() {
		assertEquals("307-577-5382", customers.get(245).getFax());
	}

	@Test
	@DisplayName("Record 246: Email is tory@wank.com")
	void EmailOfRecord246() {
		assertEquals("tory@wank.com", customers.get(245).getEmail());
	}

	@Test
	@DisplayName("Record 246: Web is http://www.torywank.com")
	void WebOfRecord246() {
		assertEquals("http://www.torywank.com", customers.get(245).getWeb());
	}
}
