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

@Tag("46")
class Record_2656 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2656: FirstName is Reynaldo")
	void FirstNameOfRecord2656() {
		assertEquals("Reynaldo", customers.get(2655).getFirstName());
	}

	@Test
	@DisplayName("Record 2656: LastName is Tichy")
	void LastNameOfRecord2656() {
		assertEquals("Tichy", customers.get(2655).getLastName());
	}

	@Test
	@DisplayName("Record 2656: Company is New England Small Frm Inst Inc")
	void CompanyOfRecord2656() {
		assertEquals("New England Small Frm Inst Inc", customers.get(2655).getCompany());
	}

	@Test
	@DisplayName("Record 2656: Address is 1500 Beville Rd")
	void AddressOfRecord2656() {
		assertEquals("1500 Beville Rd", customers.get(2655).getAddress());
	}

	@Test
	@DisplayName("Record 2656: City is Daytona Beach")
	void CityOfRecord2656() {
		assertEquals("Daytona Beach", customers.get(2655).getCity());
	}

	@Test
	@DisplayName("Record 2656: County is Volusia")
	void CountyOfRecord2656() {
		assertEquals("Volusia", customers.get(2655).getCounty());
	}

	@Test
	@DisplayName("Record 2656: State is FL")
	void StateOfRecord2656() {
		assertEquals("FL", customers.get(2655).getState());
	}

	@Test
	@DisplayName("Record 2656: ZIP is 32114")
	void ZIPOfRecord2656() {
		assertEquals("32114", customers.get(2655).getZIP());
	}

	@Test
	@DisplayName("Record 2656: Phone is 386-238-6489")
	void PhoneOfRecord2656() {
		assertEquals("386-238-6489", customers.get(2655).getPhone());
	}

	@Test
	@DisplayName("Record 2656: Fax is 386-238-4032")
	void FaxOfRecord2656() {
		assertEquals("386-238-4032", customers.get(2655).getFax());
	}

	@Test
	@DisplayName("Record 2656: Email is reynaldo@tichy.com")
	void EmailOfRecord2656() {
		assertEquals("reynaldo@tichy.com", customers.get(2655).getEmail());
	}

	@Test
	@DisplayName("Record 2656: Web is http://www.reynaldotichy.com")
	void WebOfRecord2656() {
		assertEquals("http://www.reynaldotichy.com", customers.get(2655).getWeb());
	}
}
