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

@Tag("8")
class Record_4942 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4942: FirstName is Bonnie")
	void FirstNameOfRecord4942() {
		assertEquals("Bonnie", customers.get(4941).getFirstName());
	}

	@Test
	@DisplayName("Record 4942: LastName is Mcaloon")
	void LastNameOfRecord4942() {
		assertEquals("Mcaloon", customers.get(4941).getLastName());
	}

	@Test
	@DisplayName("Record 4942: Company is Barrows, Thomas I Esq")
	void CompanyOfRecord4942() {
		assertEquals("Barrows, Thomas I Esq", customers.get(4941).getCompany());
	}

	@Test
	@DisplayName("Record 4942: Address is 210 E State Hwy  #-4")
	void AddressOfRecord4942() {
		assertEquals("210 E State Hwy  #-4", customers.get(4941).getAddress());
	}

	@Test
	@DisplayName("Record 4942: City is Paramus")
	void CityOfRecord4942() {
		assertEquals("Paramus", customers.get(4941).getCity());
	}

	@Test
	@DisplayName("Record 4942: County is Bergen")
	void CountyOfRecord4942() {
		assertEquals("Bergen", customers.get(4941).getCounty());
	}

	@Test
	@DisplayName("Record 4942: State is NJ")
	void StateOfRecord4942() {
		assertEquals("NJ", customers.get(4941).getState());
	}

	@Test
	@DisplayName("Record 4942: ZIP is 7652")
	void ZIPOfRecord4942() {
		assertEquals("7652", customers.get(4941).getZIP());
	}

	@Test
	@DisplayName("Record 4942: Phone is 201-843-5578")
	void PhoneOfRecord4942() {
		assertEquals("201-843-5578", customers.get(4941).getPhone());
	}

	@Test
	@DisplayName("Record 4942: Fax is 201-843-4896")
	void FaxOfRecord4942() {
		assertEquals("201-843-4896", customers.get(4941).getFax());
	}

	@Test
	@DisplayName("Record 4942: Email is bonnie@mcaloon.com")
	void EmailOfRecord4942() {
		assertEquals("bonnie@mcaloon.com", customers.get(4941).getEmail());
	}

	@Test
	@DisplayName("Record 4942: Web is http://www.bonniemcaloon.com")
	void WebOfRecord4942() {
		assertEquals("http://www.bonniemcaloon.com", customers.get(4941).getWeb());
	}
}
