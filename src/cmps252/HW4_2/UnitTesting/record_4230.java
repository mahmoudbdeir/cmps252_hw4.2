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

@Tag("40")
class Record_4230 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4230: FirstName is Jacques")
	void FirstNameOfRecord4230() {
		assertEquals("Jacques", customers.get(4229).getFirstName());
	}

	@Test
	@DisplayName("Record 4230: LastName is Huitt")
	void LastNameOfRecord4230() {
		assertEquals("Huitt", customers.get(4229).getLastName());
	}

	@Test
	@DisplayName("Record 4230: Company is Blackman Lumber Company")
	void CompanyOfRecord4230() {
		assertEquals("Blackman Lumber Company", customers.get(4229).getCompany());
	}

	@Test
	@DisplayName("Record 4230: Address is 4235 Secor Rd")
	void AddressOfRecord4230() {
		assertEquals("4235 Secor Rd", customers.get(4229).getAddress());
	}

	@Test
	@DisplayName("Record 4230: City is Toledo")
	void CityOfRecord4230() {
		assertEquals("Toledo", customers.get(4229).getCity());
	}

	@Test
	@DisplayName("Record 4230: County is Lucas")
	void CountyOfRecord4230() {
		assertEquals("Lucas", customers.get(4229).getCounty());
	}

	@Test
	@DisplayName("Record 4230: State is OH")
	void StateOfRecord4230() {
		assertEquals("OH", customers.get(4229).getState());
	}

	@Test
	@DisplayName("Record 4230: ZIP is 43623")
	void ZIPOfRecord4230() {
		assertEquals("43623", customers.get(4229).getZIP());
	}

	@Test
	@DisplayName("Record 4230: Phone is 419-472-5306")
	void PhoneOfRecord4230() {
		assertEquals("419-472-5306", customers.get(4229).getPhone());
	}

	@Test
	@DisplayName("Record 4230: Fax is 419-472-0051")
	void FaxOfRecord4230() {
		assertEquals("419-472-0051", customers.get(4229).getFax());
	}

	@Test
	@DisplayName("Record 4230: Email is jacques@huitt.com")
	void EmailOfRecord4230() {
		assertEquals("jacques@huitt.com", customers.get(4229).getEmail());
	}

	@Test
	@DisplayName("Record 4230: Web is http://www.jacqueshuitt.com")
	void WebOfRecord4230() {
		assertEquals("http://www.jacqueshuitt.com", customers.get(4229).getWeb());
	}
}
