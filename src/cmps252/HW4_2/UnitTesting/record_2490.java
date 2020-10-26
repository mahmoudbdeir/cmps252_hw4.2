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

@Tag("41")
class Record_2490 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2490: FirstName is Reyes")
	void FirstNameOfRecord2490() {
		assertEquals("Reyes", customers.get(2489).getFirstName());
	}

	@Test
	@DisplayName("Record 2490: LastName is Heminover")
	void LastNameOfRecord2490() {
		assertEquals("Heminover", customers.get(2489).getLastName());
	}

	@Test
	@DisplayName("Record 2490: Company is Lynch, Richard L Cpa")
	void CompanyOfRecord2490() {
		assertEquals("Lynch, Richard L Cpa", customers.get(2489).getCompany());
	}

	@Test
	@DisplayName("Record 2490: Address is 24610 Pine St  #-l")
	void AddressOfRecord2490() {
		assertEquals("24610 Pine St  #-l", customers.get(2489).getAddress());
	}

	@Test
	@DisplayName("Record 2490: City is Newhall")
	void CityOfRecord2490() {
		assertEquals("Newhall", customers.get(2489).getCity());
	}

	@Test
	@DisplayName("Record 2490: County is Los Angeles")
	void CountyOfRecord2490() {
		assertEquals("Los Angeles", customers.get(2489).getCounty());
	}

	@Test
	@DisplayName("Record 2490: State is CA")
	void StateOfRecord2490() {
		assertEquals("CA", customers.get(2489).getState());
	}

	@Test
	@DisplayName("Record 2490: ZIP is 91321")
	void ZIPOfRecord2490() {
		assertEquals("91321", customers.get(2489).getZIP());
	}

	@Test
	@DisplayName("Record 2490: Phone is 661-254-8547")
	void PhoneOfRecord2490() {
		assertEquals("661-254-8547", customers.get(2489).getPhone());
	}

	@Test
	@DisplayName("Record 2490: Fax is 661-254-2946")
	void FaxOfRecord2490() {
		assertEquals("661-254-2946", customers.get(2489).getFax());
	}

	@Test
	@DisplayName("Record 2490: Email is reyes@heminover.com")
	void EmailOfRecord2490() {
		assertEquals("reyes@heminover.com", customers.get(2489).getEmail());
	}

	@Test
	@DisplayName("Record 2490: Web is http://www.reyesheminover.com")
	void WebOfRecord2490() {
		assertEquals("http://www.reyesheminover.com", customers.get(2489).getWeb());
	}
}
