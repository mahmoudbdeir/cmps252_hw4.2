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

@Tag("9")
class Record_4271 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4271: FirstName is Guillermo")
	void FirstNameOfRecord4271() {
		assertEquals("Guillermo", customers.get(4270).getFirstName());
	}

	@Test
	@DisplayName("Record 4271: LastName is Glish")
	void LastNameOfRecord4271() {
		assertEquals("Glish", customers.get(4270).getLastName());
	}

	@Test
	@DisplayName("Record 4271: Company is Springfield Sign Corp")
	void CompanyOfRecord4271() {
		assertEquals("Springfield Sign Corp", customers.get(4270).getCompany());
	}

	@Test
	@DisplayName("Record 4271: Address is 640 Jackson St")
	void AddressOfRecord4271() {
		assertEquals("640 Jackson St", customers.get(4270).getAddress());
	}

	@Test
	@DisplayName("Record 4271: City is Saint Paul")
	void CityOfRecord4271() {
		assertEquals("Saint Paul", customers.get(4270).getCity());
	}

	@Test
	@DisplayName("Record 4271: County is Ramsey")
	void CountyOfRecord4271() {
		assertEquals("Ramsey", customers.get(4270).getCounty());
	}

	@Test
	@DisplayName("Record 4271: State is MN")
	void StateOfRecord4271() {
		assertEquals("MN", customers.get(4270).getState());
	}

	@Test
	@DisplayName("Record 4271: ZIP is 55101")
	void ZIPOfRecord4271() {
		assertEquals("55101", customers.get(4270).getZIP());
	}

	@Test
	@DisplayName("Record 4271: Phone is 651-292-2887")
	void PhoneOfRecord4271() {
		assertEquals("651-292-2887", customers.get(4270).getPhone());
	}

	@Test
	@DisplayName("Record 4271: Fax is 651-292-6969")
	void FaxOfRecord4271() {
		assertEquals("651-292-6969", customers.get(4270).getFax());
	}

	@Test
	@DisplayName("Record 4271: Email is guillermo@glish.com")
	void EmailOfRecord4271() {
		assertEquals("guillermo@glish.com", customers.get(4270).getEmail());
	}

	@Test
	@DisplayName("Record 4271: Web is http://www.guillermoglish.com")
	void WebOfRecord4271() {
		assertEquals("http://www.guillermoglish.com", customers.get(4270).getWeb());
	}
}
