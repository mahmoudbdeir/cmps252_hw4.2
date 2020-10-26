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

@Tag("48")
class Record_4568 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4568: FirstName is Malinda")
	void FirstNameOfRecord4568() {
		assertEquals("Malinda", customers.get(4567).getFirstName());
	}

	@Test
	@DisplayName("Record 4568: LastName is Neuman")
	void LastNameOfRecord4568() {
		assertEquals("Neuman", customers.get(4567).getLastName());
	}

	@Test
	@DisplayName("Record 4568: Company is Sunset West Coiffures & Btq")
	void CompanyOfRecord4568() {
		assertEquals("Sunset West Coiffures & Btq", customers.get(4567).getCompany());
	}

	@Test
	@DisplayName("Record 4568: Address is 1800 N Mason Rd")
	void AddressOfRecord4568() {
		assertEquals("1800 N Mason Rd", customers.get(4567).getAddress());
	}

	@Test
	@DisplayName("Record 4568: City is Katy")
	void CityOfRecord4568() {
		assertEquals("Katy", customers.get(4567).getCity());
	}

	@Test
	@DisplayName("Record 4568: County is Harris")
	void CountyOfRecord4568() {
		assertEquals("Harris", customers.get(4567).getCounty());
	}

	@Test
	@DisplayName("Record 4568: State is TX")
	void StateOfRecord4568() {
		assertEquals("TX", customers.get(4567).getState());
	}

	@Test
	@DisplayName("Record 4568: ZIP is 77449")
	void ZIPOfRecord4568() {
		assertEquals("77449", customers.get(4567).getZIP());
	}

	@Test
	@DisplayName("Record 4568: Phone is 281-492-6717")
	void PhoneOfRecord4568() {
		assertEquals("281-492-6717", customers.get(4567).getPhone());
	}

	@Test
	@DisplayName("Record 4568: Fax is 281-492-5274")
	void FaxOfRecord4568() {
		assertEquals("281-492-5274", customers.get(4567).getFax());
	}

	@Test
	@DisplayName("Record 4568: Email is malinda@neuman.com")
	void EmailOfRecord4568() {
		assertEquals("malinda@neuman.com", customers.get(4567).getEmail());
	}

	@Test
	@DisplayName("Record 4568: Web is http://www.malindaneuman.com")
	void WebOfRecord4568() {
		assertEquals("http://www.malindaneuman.com", customers.get(4567).getWeb());
	}
}
