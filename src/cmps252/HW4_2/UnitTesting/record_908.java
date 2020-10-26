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

@Tag("39")
class Record_908 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 908: FirstName is Reyes")
	void FirstNameOfRecord908() {
		assertEquals("Reyes", customers.get(907).getFirstName());
	}

	@Test
	@DisplayName("Record 908: LastName is Gudgell")
	void LastNameOfRecord908() {
		assertEquals("Gudgell", customers.get(907).getLastName());
	}

	@Test
	@DisplayName("Record 908: Company is Seven Springs Mountain Resort")
	void CompanyOfRecord908() {
		assertEquals("Seven Springs Mountain Resort", customers.get(907).getCompany());
	}

	@Test
	@DisplayName("Record 908: Address is 1221 Bloomfield Ave")
	void AddressOfRecord908() {
		assertEquals("1221 Bloomfield Ave", customers.get(907).getAddress());
	}

	@Test
	@DisplayName("Record 908: City is Fairfield")
	void CityOfRecord908() {
		assertEquals("Fairfield", customers.get(907).getCity());
	}

	@Test
	@DisplayName("Record 908: County is Essex")
	void CountyOfRecord908() {
		assertEquals("Essex", customers.get(907).getCounty());
	}

	@Test
	@DisplayName("Record 908: State is NJ")
	void StateOfRecord908() {
		assertEquals("NJ", customers.get(907).getState());
	}

	@Test
	@DisplayName("Record 908: ZIP is 7004")
	void ZIPOfRecord908() {
		assertEquals("7004", customers.get(907).getZIP());
	}

	@Test
	@DisplayName("Record 908: Phone is 973-882-6557")
	void PhoneOfRecord908() {
		assertEquals("973-882-6557", customers.get(907).getPhone());
	}

	@Test
	@DisplayName("Record 908: Fax is 973-882-4636")
	void FaxOfRecord908() {
		assertEquals("973-882-4636", customers.get(907).getFax());
	}

	@Test
	@DisplayName("Record 908: Email is reyes@gudgell.com")
	void EmailOfRecord908() {
		assertEquals("reyes@gudgell.com", customers.get(907).getEmail());
	}

	@Test
	@DisplayName("Record 908: Web is http://www.reyesgudgell.com")
	void WebOfRecord908() {
		assertEquals("http://www.reyesgudgell.com", customers.get(907).getWeb());
	}
}
