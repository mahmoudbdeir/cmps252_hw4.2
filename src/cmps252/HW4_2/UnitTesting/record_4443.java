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

@Tag("15")
class Record_4443 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4443: FirstName is Phoebe")
	void FirstNameOfRecord4443() {
		assertEquals("Phoebe", customers.get(4442).getFirstName());
	}

	@Test
	@DisplayName("Record 4443: LastName is Nang")
	void LastNameOfRecord4443() {
		assertEquals("Nang", customers.get(4442).getLastName());
	}

	@Test
	@DisplayName("Record 4443: Company is American Nukem Tech Corp")
	void CompanyOfRecord4443() {
		assertEquals("American Nukem Tech Corp", customers.get(4442).getCompany());
	}

	@Test
	@DisplayName("Record 4443: Address is 67 Gordon St")
	void AddressOfRecord4443() {
		assertEquals("67 Gordon St", customers.get(4442).getAddress());
	}

	@Test
	@DisplayName("Record 4443: City is Hamden")
	void CityOfRecord4443() {
		assertEquals("Hamden", customers.get(4442).getCity());
	}

	@Test
	@DisplayName("Record 4443: County is New Haven")
	void CountyOfRecord4443() {
		assertEquals("New Haven", customers.get(4442).getCounty());
	}

	@Test
	@DisplayName("Record 4443: State is CT")
	void StateOfRecord4443() {
		assertEquals("CT", customers.get(4442).getState());
	}

	@Test
	@DisplayName("Record 4443: ZIP is 6517")
	void ZIPOfRecord4443() {
		assertEquals("6517", customers.get(4442).getZIP());
	}

	@Test
	@DisplayName("Record 4443: Phone is 203-281-7171")
	void PhoneOfRecord4443() {
		assertEquals("203-281-7171", customers.get(4442).getPhone());
	}

	@Test
	@DisplayName("Record 4443: Fax is 203-281-5592")
	void FaxOfRecord4443() {
		assertEquals("203-281-5592", customers.get(4442).getFax());
	}

	@Test
	@DisplayName("Record 4443: Email is phoebe@nang.com")
	void EmailOfRecord4443() {
		assertEquals("phoebe@nang.com", customers.get(4442).getEmail());
	}

	@Test
	@DisplayName("Record 4443: Web is http://www.phoebenang.com")
	void WebOfRecord4443() {
		assertEquals("http://www.phoebenang.com", customers.get(4442).getWeb());
	}
}
