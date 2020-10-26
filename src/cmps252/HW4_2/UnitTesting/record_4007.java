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

@Tag("14")
class Record_4007 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4007: FirstName is Sandy")
	void FirstNameOfRecord4007() {
		assertEquals("Sandy", customers.get(4006).getFirstName());
	}

	@Test
	@DisplayName("Record 4007: LastName is Wolgamot")
	void LastNameOfRecord4007() {
		assertEquals("Wolgamot", customers.get(4006).getLastName());
	}

	@Test
	@DisplayName("Record 4007: Company is Holiday Inn Orangeburg")
	void CompanyOfRecord4007() {
		assertEquals("Holiday Inn Orangeburg", customers.get(4006).getCompany());
	}

	@Test
	@DisplayName("Record 4007: Address is 2850 Regional Airport")
	void AddressOfRecord4007() {
		assertEquals("2850 Regional Airport", customers.get(4006).getAddress());
	}

	@Test
	@DisplayName("Record 4007: City is Abilene")
	void CityOfRecord4007() {
		assertEquals("Abilene", customers.get(4006).getCity());
	}

	@Test
	@DisplayName("Record 4007: County is Taylor")
	void CountyOfRecord4007() {
		assertEquals("Taylor", customers.get(4006).getCounty());
	}

	@Test
	@DisplayName("Record 4007: State is TX")
	void StateOfRecord4007() {
		assertEquals("TX", customers.get(4006).getState());
	}

	@Test
	@DisplayName("Record 4007: ZIP is 79602")
	void ZIPOfRecord4007() {
		assertEquals("79602", customers.get(4006).getZIP());
	}

	@Test
	@DisplayName("Record 4007: Phone is 325-675-3309")
	void PhoneOfRecord4007() {
		assertEquals("325-675-3309", customers.get(4006).getPhone());
	}

	@Test
	@DisplayName("Record 4007: Fax is 325-675-8223")
	void FaxOfRecord4007() {
		assertEquals("325-675-8223", customers.get(4006).getFax());
	}

	@Test
	@DisplayName("Record 4007: Email is sandy@wolgamot.com")
	void EmailOfRecord4007() {
		assertEquals("sandy@wolgamot.com", customers.get(4006).getEmail());
	}

	@Test
	@DisplayName("Record 4007: Web is http://www.sandywolgamot.com")
	void WebOfRecord4007() {
		assertEquals("http://www.sandywolgamot.com", customers.get(4006).getWeb());
	}
}
