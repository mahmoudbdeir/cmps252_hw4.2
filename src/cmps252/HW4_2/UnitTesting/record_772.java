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

@Tag("36")
class Record_772 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 772: FirstName is Wilburn")
	void FirstNameOfRecord772() {
		assertEquals("Wilburn", customers.get(771).getFirstName());
	}

	@Test
	@DisplayName("Record 772: LastName is Dexter")
	void LastNameOfRecord772() {
		assertEquals("Dexter", customers.get(771).getLastName());
	}

	@Test
	@DisplayName("Record 772: Company is Islip Bulletin")
	void CompanyOfRecord772() {
		assertEquals("Islip Bulletin", customers.get(771).getCompany());
	}

	@Test
	@DisplayName("Record 772: Address is 45700 Mound Rd")
	void AddressOfRecord772() {
		assertEquals("45700 Mound Rd", customers.get(771).getAddress());
	}

	@Test
	@DisplayName("Record 772: City is Utica")
	void CityOfRecord772() {
		assertEquals("Utica", customers.get(771).getCity());
	}

	@Test
	@DisplayName("Record 772: County is Macomb")
	void CountyOfRecord772() {
		assertEquals("Macomb", customers.get(771).getCounty());
	}

	@Test
	@DisplayName("Record 772: State is MI")
	void StateOfRecord772() {
		assertEquals("MI", customers.get(771).getState());
	}

	@Test
	@DisplayName("Record 772: ZIP is 48317")
	void ZIPOfRecord772() {
		assertEquals("48317", customers.get(771).getZIP());
	}

	@Test
	@DisplayName("Record 772: Phone is 586-254-1107")
	void PhoneOfRecord772() {
		assertEquals("586-254-1107", customers.get(771).getPhone());
	}

	@Test
	@DisplayName("Record 772: Fax is 586-254-3385")
	void FaxOfRecord772() {
		assertEquals("586-254-3385", customers.get(771).getFax());
	}

	@Test
	@DisplayName("Record 772: Email is wilburn@dexter.com")
	void EmailOfRecord772() {
		assertEquals("wilburn@dexter.com", customers.get(771).getEmail());
	}

	@Test
	@DisplayName("Record 772: Web is http://www.wilburndexter.com")
	void WebOfRecord772() {
		assertEquals("http://www.wilburndexter.com", customers.get(771).getWeb());
	}
}
