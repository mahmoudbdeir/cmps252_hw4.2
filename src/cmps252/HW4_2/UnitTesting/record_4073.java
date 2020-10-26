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

@Tag("28")
class Record_4073 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4073: FirstName is Lionel")
	void FirstNameOfRecord4073() {
		assertEquals("Lionel", customers.get(4072).getFirstName());
	}

	@Test
	@DisplayName("Record 4073: LastName is Resenz")
	void LastNameOfRecord4073() {
		assertEquals("Resenz", customers.get(4072).getLastName());
	}

	@Test
	@DisplayName("Record 4073: Company is Curtiss, William H Esq")
	void CompanyOfRecord4073() {
		assertEquals("Curtiss, William H Esq", customers.get(4072).getCompany());
	}

	@Test
	@DisplayName("Record 4073: Address is 5075 Industry Dr")
	void AddressOfRecord4073() {
		assertEquals("5075 Industry Dr", customers.get(4072).getAddress());
	}

	@Test
	@DisplayName("Record 4073: City is Melbourne")
	void CityOfRecord4073() {
		assertEquals("Melbourne", customers.get(4072).getCity());
	}

	@Test
	@DisplayName("Record 4073: County is Brevard")
	void CountyOfRecord4073() {
		assertEquals("Brevard", customers.get(4072).getCounty());
	}

	@Test
	@DisplayName("Record 4073: State is FL")
	void StateOfRecord4073() {
		assertEquals("FL", customers.get(4072).getState());
	}

	@Test
	@DisplayName("Record 4073: ZIP is 32940")
	void ZIPOfRecord4073() {
		assertEquals("32940", customers.get(4072).getZIP());
	}

	@Test
	@DisplayName("Record 4073: Phone is 321-242-0512")
	void PhoneOfRecord4073() {
		assertEquals("321-242-0512", customers.get(4072).getPhone());
	}

	@Test
	@DisplayName("Record 4073: Fax is 321-242-5297")
	void FaxOfRecord4073() {
		assertEquals("321-242-5297", customers.get(4072).getFax());
	}

	@Test
	@DisplayName("Record 4073: Email is lionel@resenz.com")
	void EmailOfRecord4073() {
		assertEquals("lionel@resenz.com", customers.get(4072).getEmail());
	}

	@Test
	@DisplayName("Record 4073: Web is http://www.lionelresenz.com")
	void WebOfRecord4073() {
		assertEquals("http://www.lionelresenz.com", customers.get(4072).getWeb());
	}
}
