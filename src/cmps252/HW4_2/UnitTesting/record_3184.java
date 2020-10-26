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

@Tag("38")
class Record_3184 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3184: FirstName is Rashad")
	void FirstNameOfRecord3184() {
		assertEquals("Rashad", customers.get(3183).getFirstName());
	}

	@Test
	@DisplayName("Record 3184: LastName is Benda")
	void LastNameOfRecord3184() {
		assertEquals("Benda", customers.get(3183).getLastName());
	}

	@Test
	@DisplayName("Record 3184: Company is Wardens")
	void CompanyOfRecord3184() {
		assertEquals("Wardens", customers.get(3183).getCompany());
	}

	@Test
	@DisplayName("Record 3184: Address is 18908 13th Pl S")
	void AddressOfRecord3184() {
		assertEquals("18908 13th Pl S", customers.get(3183).getAddress());
	}

	@Test
	@DisplayName("Record 3184: City is Seattle")
	void CityOfRecord3184() {
		assertEquals("Seattle", customers.get(3183).getCity());
	}

	@Test
	@DisplayName("Record 3184: County is King")
	void CountyOfRecord3184() {
		assertEquals("King", customers.get(3183).getCounty());
	}

	@Test
	@DisplayName("Record 3184: State is WA")
	void StateOfRecord3184() {
		assertEquals("WA", customers.get(3183).getState());
	}

	@Test
	@DisplayName("Record 3184: ZIP is 98148")
	void ZIPOfRecord3184() {
		assertEquals("98148", customers.get(3183).getZIP());
	}

	@Test
	@DisplayName("Record 3184: Phone is 206-244-8540")
	void PhoneOfRecord3184() {
		assertEquals("206-244-8540", customers.get(3183).getPhone());
	}

	@Test
	@DisplayName("Record 3184: Fax is 206-244-3298")
	void FaxOfRecord3184() {
		assertEquals("206-244-3298", customers.get(3183).getFax());
	}

	@Test
	@DisplayName("Record 3184: Email is rashad@benda.com")
	void EmailOfRecord3184() {
		assertEquals("rashad@benda.com", customers.get(3183).getEmail());
	}

	@Test
	@DisplayName("Record 3184: Web is http://www.rashadbenda.com")
	void WebOfRecord3184() {
		assertEquals("http://www.rashadbenda.com", customers.get(3183).getWeb());
	}
}
