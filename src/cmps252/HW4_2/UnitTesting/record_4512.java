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

@Tag("12")
class Record_4512 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4512: FirstName is Melva")
	void FirstNameOfRecord4512() {
		assertEquals("Melva", customers.get(4511).getFirstName());
	}

	@Test
	@DisplayName("Record 4512: LastName is Nici")
	void LastNameOfRecord4512() {
		assertEquals("Nici", customers.get(4511).getLastName());
	}

	@Test
	@DisplayName("Record 4512: Company is Crossroads Speedy Printing")
	void CompanyOfRecord4512() {
		assertEquals("Crossroads Speedy Printing", customers.get(4511).getCompany());
	}

	@Test
	@DisplayName("Record 4512: Address is 650 Colonial Dr")
	void AddressOfRecord4512() {
		assertEquals("650 Colonial Dr", customers.get(4511).getAddress());
	}

	@Test
	@DisplayName("Record 4512: City is Abilene")
	void CityOfRecord4512() {
		assertEquals("Abilene", customers.get(4511).getCity());
	}

	@Test
	@DisplayName("Record 4512: County is Taylor")
	void CountyOfRecord4512() {
		assertEquals("Taylor", customers.get(4511).getCounty());
	}

	@Test
	@DisplayName("Record 4512: State is TX")
	void StateOfRecord4512() {
		assertEquals("TX", customers.get(4511).getState());
	}

	@Test
	@DisplayName("Record 4512: ZIP is 79603")
	void ZIPOfRecord4512() {
		assertEquals("79603", customers.get(4511).getZIP());
	}

	@Test
	@DisplayName("Record 4512: Phone is 325-673-8363")
	void PhoneOfRecord4512() {
		assertEquals("325-673-8363", customers.get(4511).getPhone());
	}

	@Test
	@DisplayName("Record 4512: Fax is 325-673-2558")
	void FaxOfRecord4512() {
		assertEquals("325-673-2558", customers.get(4511).getFax());
	}

	@Test
	@DisplayName("Record 4512: Email is melva@nici.com")
	void EmailOfRecord4512() {
		assertEquals("melva@nici.com", customers.get(4511).getEmail());
	}

	@Test
	@DisplayName("Record 4512: Web is http://www.melvanici.com")
	void WebOfRecord4512() {
		assertEquals("http://www.melvanici.com", customers.get(4511).getWeb());
	}
}
