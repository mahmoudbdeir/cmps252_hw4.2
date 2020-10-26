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

@Tag("22")
class Record_436 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 436: FirstName is Kelly")
	void FirstNameOfRecord436() {
		assertEquals("Kelly", customers.get(435).getFirstName());
	}

	@Test
	@DisplayName("Record 436: LastName is Noggler")
	void LastNameOfRecord436() {
		assertEquals("Noggler", customers.get(435).getLastName());
	}

	@Test
	@DisplayName("Record 436: Company is Hungarian Kossuth Hall")
	void CompanyOfRecord436() {
		assertEquals("Hungarian Kossuth Hall", customers.get(435).getCompany());
	}

	@Test
	@DisplayName("Record 436: Address is 114 Walnut St")
	void AddressOfRecord436() {
		assertEquals("114 Walnut St", customers.get(435).getAddress());
	}

	@Test
	@DisplayName("Record 436: City is Morton")
	void CityOfRecord436() {
		assertEquals("Morton", customers.get(435).getCity());
	}

	@Test
	@DisplayName("Record 436: County is Delaware")
	void CountyOfRecord436() {
		assertEquals("Delaware", customers.get(435).getCounty());
	}

	@Test
	@DisplayName("Record 436: State is PA")
	void StateOfRecord436() {
		assertEquals("PA", customers.get(435).getState());
	}

	@Test
	@DisplayName("Record 436: ZIP is 19070")
	void ZIPOfRecord436() {
		assertEquals("19070", customers.get(435).getZIP());
	}

	@Test
	@DisplayName("Record 436: Phone is 610-543-5018")
	void PhoneOfRecord436() {
		assertEquals("610-543-5018", customers.get(435).getPhone());
	}

	@Test
	@DisplayName("Record 436: Fax is 610-543-8457")
	void FaxOfRecord436() {
		assertEquals("610-543-8457", customers.get(435).getFax());
	}

	@Test
	@DisplayName("Record 436: Email is kelly@noggler.com")
	void EmailOfRecord436() {
		assertEquals("kelly@noggler.com", customers.get(435).getEmail());
	}

	@Test
	@DisplayName("Record 436: Web is http://www.kellynoggler.com")
	void WebOfRecord436() {
		assertEquals("http://www.kellynoggler.com", customers.get(435).getWeb());
	}
}
