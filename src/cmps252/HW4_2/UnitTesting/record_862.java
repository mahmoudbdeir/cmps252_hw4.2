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

@Tag("2")
class Record_862 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 862: FirstName is Maritsa")
	void FirstNameOfRecord862() {
		assertEquals("Maritsa", customers.get(861).getFirstName());
	}

	@Test
	@DisplayName("Record 862: LastName is Too")
	void LastNameOfRecord862() {
		assertEquals("Too", customers.get(861).getLastName());
	}

	@Test
	@DisplayName("Record 862: Company is South Bay Precision")
	void CompanyOfRecord862() {
		assertEquals("South Bay Precision", customers.get(861).getCompany());
	}

	@Test
	@DisplayName("Record 862: Address is 625 Us Highway 13")
	void AddressOfRecord862() {
		assertEquals("625 Us Highway 13", customers.get(861).getAddress());
	}

	@Test
	@DisplayName("Record 862: City is Bristol")
	void CityOfRecord862() {
		assertEquals("Bristol", customers.get(861).getCity());
	}

	@Test
	@DisplayName("Record 862: County is Bucks")
	void CountyOfRecord862() {
		assertEquals("Bucks", customers.get(861).getCounty());
	}

	@Test
	@DisplayName("Record 862: State is PA")
	void StateOfRecord862() {
		assertEquals("PA", customers.get(861).getState());
	}

	@Test
	@DisplayName("Record 862: ZIP is 19007")
	void ZIPOfRecord862() {
		assertEquals("19007", customers.get(861).getZIP());
	}

	@Test
	@DisplayName("Record 862: Phone is 215-785-1474")
	void PhoneOfRecord862() {
		assertEquals("215-785-1474", customers.get(861).getPhone());
	}

	@Test
	@DisplayName("Record 862: Fax is 215-785-5444")
	void FaxOfRecord862() {
		assertEquals("215-785-5444", customers.get(861).getFax());
	}

	@Test
	@DisplayName("Record 862: Email is maritsa@too.com")
	void EmailOfRecord862() {
		assertEquals("maritsa@too.com", customers.get(861).getEmail());
	}

	@Test
	@DisplayName("Record 862: Web is http://www.maritsatoo.com")
	void WebOfRecord862() {
		assertEquals("http://www.maritsatoo.com", customers.get(861).getWeb());
	}
}
