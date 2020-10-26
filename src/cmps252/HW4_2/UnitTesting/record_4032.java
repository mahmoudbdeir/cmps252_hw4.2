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

@Tag("26")
class Record_4032 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4032: FirstName is Hydi")
	void FirstNameOfRecord4032() {
		assertEquals("Hydi", customers.get(4031).getFirstName());
	}

	@Test
	@DisplayName("Record 4032: LastName is Tetrault")
	void LastNameOfRecord4032() {
		assertEquals("Tetrault", customers.get(4031).getLastName());
	}

	@Test
	@DisplayName("Record 4032: Company is Anderson, Mark Esq")
	void CompanyOfRecord4032() {
		assertEquals("Anderson, Mark Esq", customers.get(4031).getCompany());
	}

	@Test
	@DisplayName("Record 4032: Address is 2207 E Tudor Rd")
	void AddressOfRecord4032() {
		assertEquals("2207 E Tudor Rd", customers.get(4031).getAddress());
	}

	@Test
	@DisplayName("Record 4032: City is Anchorage")
	void CityOfRecord4032() {
		assertEquals("Anchorage", customers.get(4031).getCity());
	}

	@Test
	@DisplayName("Record 4032: County is Anchorage")
	void CountyOfRecord4032() {
		assertEquals("Anchorage", customers.get(4031).getCounty());
	}

	@Test
	@DisplayName("Record 4032: State is AK")
	void StateOfRecord4032() {
		assertEquals("AK", customers.get(4031).getState());
	}

	@Test
	@DisplayName("Record 4032: ZIP is 99507")
	void ZIPOfRecord4032() {
		assertEquals("99507", customers.get(4031).getZIP());
	}

	@Test
	@DisplayName("Record 4032: Phone is 907-562-0525")
	void PhoneOfRecord4032() {
		assertEquals("907-562-0525", customers.get(4031).getPhone());
	}

	@Test
	@DisplayName("Record 4032: Fax is 907-562-2897")
	void FaxOfRecord4032() {
		assertEquals("907-562-2897", customers.get(4031).getFax());
	}

	@Test
	@DisplayName("Record 4032: Email is hydi@tetrault.com")
	void EmailOfRecord4032() {
		assertEquals("hydi@tetrault.com", customers.get(4031).getEmail());
	}

	@Test
	@DisplayName("Record 4032: Web is http://www.hyditetrault.com")
	void WebOfRecord4032() {
		assertEquals("http://www.hyditetrault.com", customers.get(4031).getWeb());
	}
}
