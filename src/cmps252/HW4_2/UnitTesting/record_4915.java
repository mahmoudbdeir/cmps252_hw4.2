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

@Tag("47")
class Record_4915 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4915: FirstName is Dwayne")
	void FirstNameOfRecord4915() {
		assertEquals("Dwayne", customers.get(4914).getFirstName());
	}

	@Test
	@DisplayName("Record 4915: LastName is Iese")
	void LastNameOfRecord4915() {
		assertEquals("Iese", customers.get(4914).getLastName());
	}

	@Test
	@DisplayName("Record 4915: Company is Mallette Carver Realty")
	void CompanyOfRecord4915() {
		assertEquals("Mallette Carver Realty", customers.get(4914).getCompany());
	}

	@Test
	@DisplayName("Record 4915: Address is 1050 17th St Nw")
	void AddressOfRecord4915() {
		assertEquals("1050 17th St Nw", customers.get(4914).getAddress());
	}

	@Test
	@DisplayName("Record 4915: City is Washington")
	void CityOfRecord4915() {
		assertEquals("Washington", customers.get(4914).getCity());
	}

	@Test
	@DisplayName("Record 4915: County is District of Columbia")
	void CountyOfRecord4915() {
		assertEquals("District of Columbia", customers.get(4914).getCounty());
	}

	@Test
	@DisplayName("Record 4915: State is DC")
	void StateOfRecord4915() {
		assertEquals("DC", customers.get(4914).getState());
	}

	@Test
	@DisplayName("Record 4915: ZIP is 20036")
	void ZIPOfRecord4915() {
		assertEquals("20036", customers.get(4914).getZIP());
	}

	@Test
	@DisplayName("Record 4915: Phone is 202-223-1596")
	void PhoneOfRecord4915() {
		assertEquals("202-223-1596", customers.get(4914).getPhone());
	}

	@Test
	@DisplayName("Record 4915: Fax is 202-223-3255")
	void FaxOfRecord4915() {
		assertEquals("202-223-3255", customers.get(4914).getFax());
	}

	@Test
	@DisplayName("Record 4915: Email is dwayne@iese.com")
	void EmailOfRecord4915() {
		assertEquals("dwayne@iese.com", customers.get(4914).getEmail());
	}

	@Test
	@DisplayName("Record 4915: Web is http://www.dwaynyese.com")
	void WebOfRecord4915() {
		assertEquals("http://www.dwaynyese.com", customers.get(4914).getWeb());
	}
}
