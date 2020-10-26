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
class Record_594 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 594: FirstName is Kent")
	void FirstNameOfRecord594() {
		assertEquals("Kent", customers.get(593).getFirstName());
	}

	@Test
	@DisplayName("Record 594: LastName is Beemon")
	void LastNameOfRecord594() {
		assertEquals("Beemon", customers.get(593).getLastName());
	}

	@Test
	@DisplayName("Record 594: Company is Kingree, Ben Iii")
	void CompanyOfRecord594() {
		assertEquals("Kingree, Ben Iii", customers.get(593).getCompany());
	}

	@Test
	@DisplayName("Record 594: Address is 225 Villa Dr")
	void AddressOfRecord594() {
		assertEquals("225 Villa Dr", customers.get(593).getAddress());
	}

	@Test
	@DisplayName("Record 594: City is Corpus Christi")
	void CityOfRecord594() {
		assertEquals("Corpus Christi", customers.get(593).getCity());
	}

	@Test
	@DisplayName("Record 594: County is Nueces")
	void CountyOfRecord594() {
		assertEquals("Nueces", customers.get(593).getCounty());
	}

	@Test
	@DisplayName("Record 594: State is TX")
	void StateOfRecord594() {
		assertEquals("TX", customers.get(593).getState());
	}

	@Test
	@DisplayName("Record 594: ZIP is 78408")
	void ZIPOfRecord594() {
		assertEquals("78408", customers.get(593).getZIP());
	}

	@Test
	@DisplayName("Record 594: Phone is 361-883-0539")
	void PhoneOfRecord594() {
		assertEquals("361-883-0539", customers.get(593).getPhone());
	}

	@Test
	@DisplayName("Record 594: Fax is 361-883-5729")
	void FaxOfRecord594() {
		assertEquals("361-883-5729", customers.get(593).getFax());
	}

	@Test
	@DisplayName("Record 594: Email is kent@beemon.com")
	void EmailOfRecord594() {
		assertEquals("kent@beemon.com", customers.get(593).getEmail());
	}

	@Test
	@DisplayName("Record 594: Web is http://www.kentbeemon.com")
	void WebOfRecord594() {
		assertEquals("http://www.kentbeemon.com", customers.get(593).getWeb());
	}
}
