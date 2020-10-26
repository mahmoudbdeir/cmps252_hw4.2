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
class Record_2513 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2513: FirstName is Kerry")
	void FirstNameOfRecord2513() {
		assertEquals("Kerry", customers.get(2512).getFirstName());
	}

	@Test
	@DisplayName("Record 2513: LastName is Lembo")
	void LastNameOfRecord2513() {
		assertEquals("Lembo", customers.get(2512).getLastName());
	}

	@Test
	@DisplayName("Record 2513: Company is Computer Discount Warehouse")
	void CompanyOfRecord2513() {
		assertEquals("Computer Discount Warehouse", customers.get(2512).getCompany());
	}

	@Test
	@DisplayName("Record 2513: Address is Grooms Ln")
	void AddressOfRecord2513() {
		assertEquals("Grooms Ln", customers.get(2512).getAddress());
	}

	@Test
	@DisplayName("Record 2513: City is Princeton")
	void CityOfRecord2513() {
		assertEquals("Princeton", customers.get(2512).getCity());
	}

	@Test
	@DisplayName("Record 2513: County is Caldwell")
	void CountyOfRecord2513() {
		assertEquals("Caldwell", customers.get(2512).getCounty());
	}

	@Test
	@DisplayName("Record 2513: State is KY")
	void StateOfRecord2513() {
		assertEquals("KY", customers.get(2512).getState());
	}

	@Test
	@DisplayName("Record 2513: ZIP is 42445")
	void ZIPOfRecord2513() {
		assertEquals("42445", customers.get(2512).getZIP());
	}

	@Test
	@DisplayName("Record 2513: Phone is 270-365-5500")
	void PhoneOfRecord2513() {
		assertEquals("270-365-5500", customers.get(2512).getPhone());
	}

	@Test
	@DisplayName("Record 2513: Fax is 270-365-4384")
	void FaxOfRecord2513() {
		assertEquals("270-365-4384", customers.get(2512).getFax());
	}

	@Test
	@DisplayName("Record 2513: Email is kerry@lembo.com")
	void EmailOfRecord2513() {
		assertEquals("kerry@lembo.com", customers.get(2512).getEmail());
	}

	@Test
	@DisplayName("Record 2513: Web is http://www.kerrylembo.com")
	void WebOfRecord2513() {
		assertEquals("http://www.kerrylembo.com", customers.get(2512).getWeb());
	}
}
