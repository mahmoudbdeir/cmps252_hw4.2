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

@Tag("31")
class Record_3529 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3529: FirstName is Bryant")
	void FirstNameOfRecord3529() {
		assertEquals("Bryant", customers.get(3528).getFirstName());
	}

	@Test
	@DisplayName("Record 3529: LastName is Gatchel")
	void LastNameOfRecord3529() {
		assertEquals("Gatchel", customers.get(3528).getLastName());
	}

	@Test
	@DisplayName("Record 3529: Company is Brunkow Hardwood Corp")
	void CompanyOfRecord3529() {
		assertEquals("Brunkow Hardwood Corp", customers.get(3528).getCompany());
	}

	@Test
	@DisplayName("Record 3529: Address is 3825 N Elston Ave")
	void AddressOfRecord3529() {
		assertEquals("3825 N Elston Ave", customers.get(3528).getAddress());
	}

	@Test
	@DisplayName("Record 3529: City is Chicago")
	void CityOfRecord3529() {
		assertEquals("Chicago", customers.get(3528).getCity());
	}

	@Test
	@DisplayName("Record 3529: County is Cook")
	void CountyOfRecord3529() {
		assertEquals("Cook", customers.get(3528).getCounty());
	}

	@Test
	@DisplayName("Record 3529: State is IL")
	void StateOfRecord3529() {
		assertEquals("IL", customers.get(3528).getState());
	}

	@Test
	@DisplayName("Record 3529: ZIP is 60618")
	void ZIPOfRecord3529() {
		assertEquals("60618", customers.get(3528).getZIP());
	}

	@Test
	@DisplayName("Record 3529: Phone is 773-583-9153")
	void PhoneOfRecord3529() {
		assertEquals("773-583-9153", customers.get(3528).getPhone());
	}

	@Test
	@DisplayName("Record 3529: Fax is 773-583-9859")
	void FaxOfRecord3529() {
		assertEquals("773-583-9859", customers.get(3528).getFax());
	}

	@Test
	@DisplayName("Record 3529: Email is bryant@gatchel.com")
	void EmailOfRecord3529() {
		assertEquals("bryant@gatchel.com", customers.get(3528).getEmail());
	}

	@Test
	@DisplayName("Record 3529: Web is http://www.bryantgatchel.com")
	void WebOfRecord3529() {
		assertEquals("http://www.bryantgatchel.com", customers.get(3528).getWeb());
	}
}
