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
class Record_2400 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2400: FirstName is Will")
	void FirstNameOfRecord2400() {
		assertEquals("Will", customers.get(2399).getFirstName());
	}

	@Test
	@DisplayName("Record 2400: LastName is Tedrow")
	void LastNameOfRecord2400() {
		assertEquals("Tedrow", customers.get(2399).getLastName());
	}

	@Test
	@DisplayName("Record 2400: Company is Assn For Advmnt Automtv Medcn")
	void CompanyOfRecord2400() {
		assertEquals("Assn For Advmnt Automtv Medcn", customers.get(2399).getCompany());
	}

	@Test
	@DisplayName("Record 2400: Address is 834 N Plankinton Ave")
	void AddressOfRecord2400() {
		assertEquals("834 N Plankinton Ave", customers.get(2399).getAddress());
	}

	@Test
	@DisplayName("Record 2400: City is Milwaukee")
	void CityOfRecord2400() {
		assertEquals("Milwaukee", customers.get(2399).getCity());
	}

	@Test
	@DisplayName("Record 2400: County is Milwaukee")
	void CountyOfRecord2400() {
		assertEquals("Milwaukee", customers.get(2399).getCounty());
	}

	@Test
	@DisplayName("Record 2400: State is WI")
	void StateOfRecord2400() {
		assertEquals("WI", customers.get(2399).getState());
	}

	@Test
	@DisplayName("Record 2400: ZIP is 53203")
	void ZIPOfRecord2400() {
		assertEquals("53203", customers.get(2399).getZIP());
	}

	@Test
	@DisplayName("Record 2400: Phone is 414-372-2239")
	void PhoneOfRecord2400() {
		assertEquals("414-372-2239", customers.get(2399).getPhone());
	}

	@Test
	@DisplayName("Record 2400: Fax is 414-372-4268")
	void FaxOfRecord2400() {
		assertEquals("414-372-4268", customers.get(2399).getFax());
	}

	@Test
	@DisplayName("Record 2400: Email is will@tedrow.com")
	void EmailOfRecord2400() {
		assertEquals("will@tedrow.com", customers.get(2399).getEmail());
	}

	@Test
	@DisplayName("Record 2400: Web is http://www.willtedrow.com")
	void WebOfRecord2400() {
		assertEquals("http://www.willtedrow.com", customers.get(2399).getWeb());
	}
}
