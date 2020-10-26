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

@Tag("4")
class Record_1649 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1649: FirstName is Freddy")
	void FirstNameOfRecord1649() {
		assertEquals("Freddy", customers.get(1648).getFirstName());
	}

	@Test
	@DisplayName("Record 1649: LastName is Franich")
	void LastNameOfRecord1649() {
		assertEquals("Franich", customers.get(1648).getLastName());
	}

	@Test
	@DisplayName("Record 1649: Company is Belch & Assocs")
	void CompanyOfRecord1649() {
		assertEquals("Belch & Assocs", customers.get(1648).getCompany());
	}

	@Test
	@DisplayName("Record 1649: Address is 10370 Richmond Ave")
	void AddressOfRecord1649() {
		assertEquals("10370 Richmond Ave", customers.get(1648).getAddress());
	}

	@Test
	@DisplayName("Record 1649: City is Houston")
	void CityOfRecord1649() {
		assertEquals("Houston", customers.get(1648).getCity());
	}

	@Test
	@DisplayName("Record 1649: County is Harris")
	void CountyOfRecord1649() {
		assertEquals("Harris", customers.get(1648).getCounty());
	}

	@Test
	@DisplayName("Record 1649: State is TX")
	void StateOfRecord1649() {
		assertEquals("TX", customers.get(1648).getState());
	}

	@Test
	@DisplayName("Record 1649: ZIP is 77042")
	void ZIPOfRecord1649() {
		assertEquals("77042", customers.get(1648).getZIP());
	}

	@Test
	@DisplayName("Record 1649: Phone is 713-266-8082")
	void PhoneOfRecord1649() {
		assertEquals("713-266-8082", customers.get(1648).getPhone());
	}

	@Test
	@DisplayName("Record 1649: Fax is 713-266-8175")
	void FaxOfRecord1649() {
		assertEquals("713-266-8175", customers.get(1648).getFax());
	}

	@Test
	@DisplayName("Record 1649: Email is freddy@franich.com")
	void EmailOfRecord1649() {
		assertEquals("freddy@franich.com", customers.get(1648).getEmail());
	}

	@Test
	@DisplayName("Record 1649: Web is http://www.freddyfranich.com")
	void WebOfRecord1649() {
		assertEquals("http://www.freddyfranich.com", customers.get(1648).getWeb());
	}
}
