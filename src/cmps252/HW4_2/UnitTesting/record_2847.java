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

@Tag("6")
class Record_2847 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2847: FirstName is Cheri")
	void FirstNameOfRecord2847() {
		assertEquals("Cheri", customers.get(2846).getFirstName());
	}

	@Test
	@DisplayName("Record 2847: LastName is Ulses")
	void LastNameOfRecord2847() {
		assertEquals("Ulses", customers.get(2846).getLastName());
	}

	@Test
	@DisplayName("Record 2847: Company is United States Polo Association")
	void CompanyOfRecord2847() {
		assertEquals("United States Polo Association", customers.get(2846).getCompany());
	}

	@Test
	@DisplayName("Record 2847: Address is 3415 W Lemon St")
	void AddressOfRecord2847() {
		assertEquals("3415 W Lemon St", customers.get(2846).getAddress());
	}

	@Test
	@DisplayName("Record 2847: City is Tampa")
	void CityOfRecord2847() {
		assertEquals("Tampa", customers.get(2846).getCity());
	}

	@Test
	@DisplayName("Record 2847: County is Hillsborough")
	void CountyOfRecord2847() {
		assertEquals("Hillsborough", customers.get(2846).getCounty());
	}

	@Test
	@DisplayName("Record 2847: State is FL")
	void StateOfRecord2847() {
		assertEquals("FL", customers.get(2846).getState());
	}

	@Test
	@DisplayName("Record 2847: ZIP is 33609")
	void ZIPOfRecord2847() {
		assertEquals("33609", customers.get(2846).getZIP());
	}

	@Test
	@DisplayName("Record 2847: Phone is 813-878-7307")
	void PhoneOfRecord2847() {
		assertEquals("813-878-7307", customers.get(2846).getPhone());
	}

	@Test
	@DisplayName("Record 2847: Fax is 813-878-2444")
	void FaxOfRecord2847() {
		assertEquals("813-878-2444", customers.get(2846).getFax());
	}

	@Test
	@DisplayName("Record 2847: Email is cheri@ulses.com")
	void EmailOfRecord2847() {
		assertEquals("cheri@ulses.com", customers.get(2846).getEmail());
	}

	@Test
	@DisplayName("Record 2847: Web is http://www.cheriulses.com")
	void WebOfRecord2847() {
		assertEquals("http://www.cheriulses.com", customers.get(2846).getWeb());
	}
}
