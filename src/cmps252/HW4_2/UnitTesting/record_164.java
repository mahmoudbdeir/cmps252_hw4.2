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

@Tag("24")
class Record_164 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 164: FirstName is Florine")
	void FirstNameOfRecord164() {
		assertEquals("Florine", customers.get(163).getFirstName());
	}

	@Test
	@DisplayName("Record 164: LastName is Rambus")
	void LastNameOfRecord164() {
		assertEquals("Rambus", customers.get(163).getLastName());
	}

	@Test
	@DisplayName("Record 164: Company is Multiple Sclerosis Cmprhnsv")
	void CompanyOfRecord164() {
		assertEquals("Multiple Sclerosis Cmprhnsv", customers.get(163).getCompany());
	}

	@Test
	@DisplayName("Record 164: Address is 333 South Dr")
	void AddressOfRecord164() {
		assertEquals("333 South Dr", customers.get(163).getAddress());
	}

	@Test
	@DisplayName("Record 164: City is Paramus")
	void CityOfRecord164() {
		assertEquals("Paramus", customers.get(163).getCity());
	}

	@Test
	@DisplayName("Record 164: County is Bergen")
	void CountyOfRecord164() {
		assertEquals("Bergen", customers.get(163).getCounty());
	}

	@Test
	@DisplayName("Record 164: State is NJ")
	void StateOfRecord164() {
		assertEquals("NJ", customers.get(163).getState());
	}

	@Test
	@DisplayName("Record 164: ZIP is 07652")
	void ZIPOfRecord164() {
		assertEquals("07652", customers.get(163).getZIP());
	}

	@Test
	@DisplayName("Record 164: Phone is 201-262-0141")
	void PhoneOfRecord164() {
		assertEquals("201-262-0141", customers.get(163).getPhone());
	}

	@Test
	@DisplayName("Record 164: Fax is 201-262-8416")
	void FaxOfRecord164() {
		assertEquals("201-262-8416", customers.get(163).getFax());
	}

	@Test
	@DisplayName("Record 164: Email is florine@rambus.com")
	void EmailOfRecord164() {
		assertEquals("florine@rambus.com", customers.get(163).getEmail());
	}

	@Test
	@DisplayName("Record 164: Web is http://www.florinerambus.com")
	void WebOfRecord164() {
		assertEquals("http://www.florinerambus.com", customers.get(163).getWeb());
	}
}
