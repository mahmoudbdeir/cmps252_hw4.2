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

@Tag("1")
class Record_654 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 654: FirstName is Glenn")
	void FirstNameOfRecord654() {
		assertEquals("Glenn", customers.get(653).getFirstName());
	}

	@Test
	@DisplayName("Record 654: LastName is Babyak")
	void LastNameOfRecord654() {
		assertEquals("Babyak", customers.get(653).getLastName());
	}

	@Test
	@DisplayName("Record 654: Company is Mer General Machine")
	void CompanyOfRecord654() {
		assertEquals("Mer General Machine", customers.get(653).getCompany());
	}

	@Test
	@DisplayName("Record 654: Address is 2530 W Buckeye Rd")
	void AddressOfRecord654() {
		assertEquals("2530 W Buckeye Rd", customers.get(653).getAddress());
	}

	@Test
	@DisplayName("Record 654: City is Phoenix")
	void CityOfRecord654() {
		assertEquals("Phoenix", customers.get(653).getCity());
	}

	@Test
	@DisplayName("Record 654: County is Maricopa")
	void CountyOfRecord654() {
		assertEquals("Maricopa", customers.get(653).getCounty());
	}

	@Test
	@DisplayName("Record 654: State is AZ")
	void StateOfRecord654() {
		assertEquals("AZ", customers.get(653).getState());
	}

	@Test
	@DisplayName("Record 654: ZIP is 85009")
	void ZIPOfRecord654() {
		assertEquals("85009", customers.get(653).getZIP());
	}

	@Test
	@DisplayName("Record 654: Phone is 602-278-6192")
	void PhoneOfRecord654() {
		assertEquals("602-278-6192", customers.get(653).getPhone());
	}

	@Test
	@DisplayName("Record 654: Fax is 602-278-7219")
	void FaxOfRecord654() {
		assertEquals("602-278-7219", customers.get(653).getFax());
	}

	@Test
	@DisplayName("Record 654: Email is glenn@babyak.com")
	void EmailOfRecord654() {
		assertEquals("glenn@babyak.com", customers.get(653).getEmail());
	}

	@Test
	@DisplayName("Record 654: Web is http://www.glennbabyak.com")
	void WebOfRecord654() {
		assertEquals("http://www.glennbabyak.com", customers.get(653).getWeb());
	}
}
