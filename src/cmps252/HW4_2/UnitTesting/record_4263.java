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

@Tag("11")
class Record_4263 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4263: FirstName is Christi")
	void FirstNameOfRecord4263() {
		assertEquals("Christi", customers.get(4262).getFirstName());
	}

	@Test
	@DisplayName("Record 4263: LastName is Wyst")
	void LastNameOfRecord4263() {
		assertEquals("Wyst", customers.get(4262).getLastName());
	}

	@Test
	@DisplayName("Record 4263: Company is Custom Company")
	void CompanyOfRecord4263() {
		assertEquals("Custom Company", customers.get(4262).getCompany());
	}

	@Test
	@DisplayName("Record 4263: Address is 4192 W Maple Ave")
	void AddressOfRecord4263() {
		assertEquals("4192 W Maple Ave", customers.get(4262).getAddress());
	}

	@Test
	@DisplayName("Record 4263: City is Adrian")
	void CityOfRecord4263() {
		assertEquals("Adrian", customers.get(4262).getCity());
	}

	@Test
	@DisplayName("Record 4263: County is Lenawee")
	void CountyOfRecord4263() {
		assertEquals("Lenawee", customers.get(4262).getCounty());
	}

	@Test
	@DisplayName("Record 4263: State is MI")
	void StateOfRecord4263() {
		assertEquals("MI", customers.get(4262).getState());
	}

	@Test
	@DisplayName("Record 4263: ZIP is 49221")
	void ZIPOfRecord4263() {
		assertEquals("49221", customers.get(4262).getZIP());
	}

	@Test
	@DisplayName("Record 4263: Phone is 517-265-0382")
	void PhoneOfRecord4263() {
		assertEquals("517-265-0382", customers.get(4262).getPhone());
	}

	@Test
	@DisplayName("Record 4263: Fax is 517-265-0593")
	void FaxOfRecord4263() {
		assertEquals("517-265-0593", customers.get(4262).getFax());
	}

	@Test
	@DisplayName("Record 4263: Email is christi@wyst.com")
	void EmailOfRecord4263() {
		assertEquals("christi@wyst.com", customers.get(4262).getEmail());
	}

	@Test
	@DisplayName("Record 4263: Web is http://www.christiwyst.com")
	void WebOfRecord4263() {
		assertEquals("http://www.christiwyst.com", customers.get(4262).getWeb());
	}
}
