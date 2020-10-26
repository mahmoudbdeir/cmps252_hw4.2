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

@Tag("16")
class Record_571 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 571: FirstName is Anthony")
	void FirstNameOfRecord571() {
		assertEquals("Anthony", customers.get(570).getFirstName());
	}

	@Test
	@DisplayName("Record 571: LastName is Carnovale")
	void LastNameOfRecord571() {
		assertEquals("Carnovale", customers.get(570).getLastName());
	}

	@Test
	@DisplayName("Record 571: Company is Pennant Moldings")
	void CompanyOfRecord571() {
		assertEquals("Pennant Moldings", customers.get(570).getCompany());
	}

	@Test
	@DisplayName("Record 571: Address is 12249 8th Ave S")
	void AddressOfRecord571() {
		assertEquals("12249 8th Ave S", customers.get(570).getAddress());
	}

	@Test
	@DisplayName("Record 571: City is Seattle")
	void CityOfRecord571() {
		assertEquals("Seattle", customers.get(570).getCity());
	}

	@Test
	@DisplayName("Record 571: County is King")
	void CountyOfRecord571() {
		assertEquals("King", customers.get(570).getCounty());
	}

	@Test
	@DisplayName("Record 571: State is WA")
	void StateOfRecord571() {
		assertEquals("WA", customers.get(570).getState());
	}

	@Test
	@DisplayName("Record 571: ZIP is 98168")
	void ZIPOfRecord571() {
		assertEquals("98168", customers.get(570).getZIP());
	}

	@Test
	@DisplayName("Record 571: Phone is 206-241-3879")
	void PhoneOfRecord571() {
		assertEquals("206-241-3879", customers.get(570).getPhone());
	}

	@Test
	@DisplayName("Record 571: Fax is 206-241-0452")
	void FaxOfRecord571() {
		assertEquals("206-241-0452", customers.get(570).getFax());
	}

	@Test
	@DisplayName("Record 571: Email is anthony@carnovale.com")
	void EmailOfRecord571() {
		assertEquals("anthony@carnovale.com", customers.get(570).getEmail());
	}

	@Test
	@DisplayName("Record 571: Web is http://www.anthonycarnovale.com")
	void WebOfRecord571() {
		assertEquals("http://www.anthonycarnovale.com", customers.get(570).getWeb());
	}
}
