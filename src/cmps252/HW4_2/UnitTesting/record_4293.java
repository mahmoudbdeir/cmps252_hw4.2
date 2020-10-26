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

@Tag("33")
class Record_4293 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4293: FirstName is Leon")
	void FirstNameOfRecord4293() {
		assertEquals("Leon", customers.get(4292).getFirstName());
	}

	@Test
	@DisplayName("Record 4293: LastName is Maschak")
	void LastNameOfRecord4293() {
		assertEquals("Maschak", customers.get(4292).getLastName());
	}

	@Test
	@DisplayName("Record 4293: Company is Folli Follie")
	void CompanyOfRecord4293() {
		assertEquals("Folli Follie", customers.get(4292).getCompany());
	}

	@Test
	@DisplayName("Record 4293: Address is First National Plac  #-i")
	void AddressOfRecord4293() {
		assertEquals("First National Plac  #-i", customers.get(4292).getAddress());
	}

	@Test
	@DisplayName("Record 4293: City is Amarillo")
	void CityOfRecord4293() {
		assertEquals("Amarillo", customers.get(4292).getCity());
	}

	@Test
	@DisplayName("Record 4293: County is Potter")
	void CountyOfRecord4293() {
		assertEquals("Potter", customers.get(4292).getCounty());
	}

	@Test
	@DisplayName("Record 4293: State is TX")
	void StateOfRecord4293() {
		assertEquals("TX", customers.get(4292).getState());
	}

	@Test
	@DisplayName("Record 4293: ZIP is 79101")
	void ZIPOfRecord4293() {
		assertEquals("79101", customers.get(4292).getZIP());
	}

	@Test
	@DisplayName("Record 4293: Phone is 806-372-7864")
	void PhoneOfRecord4293() {
		assertEquals("806-372-7864", customers.get(4292).getPhone());
	}

	@Test
	@DisplayName("Record 4293: Fax is 806-372-1627")
	void FaxOfRecord4293() {
		assertEquals("806-372-1627", customers.get(4292).getFax());
	}

	@Test
	@DisplayName("Record 4293: Email is leon@maschak.com")
	void EmailOfRecord4293() {
		assertEquals("leon@maschak.com", customers.get(4292).getEmail());
	}

	@Test
	@DisplayName("Record 4293: Web is http://www.leonmaschak.com")
	void WebOfRecord4293() {
		assertEquals("http://www.leonmaschak.com", customers.get(4292).getWeb());
	}
}
