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

@Tag("39")
class Record_3374 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3374: FirstName is Monroe")
	void FirstNameOfRecord3374() {
		assertEquals("Monroe", customers.get(3373).getFirstName());
	}

	@Test
	@DisplayName("Record 3374: LastName is Mckin")
	void LastNameOfRecord3374() {
		assertEquals("Mckin", customers.get(3373).getLastName());
	}

	@Test
	@DisplayName("Record 3374: Company is Intrntl Labor Commctns Assn")
	void CompanyOfRecord3374() {
		assertEquals("Intrntl Labor Commctns Assn", customers.get(3373).getCompany());
	}

	@Test
	@DisplayName("Record 3374: Address is 14333 Laurel Bowie Rd")
	void AddressOfRecord3374() {
		assertEquals("14333 Laurel Bowie Rd", customers.get(3373).getAddress());
	}

	@Test
	@DisplayName("Record 3374: City is Laurel")
	void CityOfRecord3374() {
		assertEquals("Laurel", customers.get(3373).getCity());
	}

	@Test
	@DisplayName("Record 3374: County is Prince Georges")
	void CountyOfRecord3374() {
		assertEquals("Prince Georges", customers.get(3373).getCounty());
	}

	@Test
	@DisplayName("Record 3374: State is MD")
	void StateOfRecord3374() {
		assertEquals("MD", customers.get(3373).getState());
	}

	@Test
	@DisplayName("Record 3374: ZIP is 20708")
	void ZIPOfRecord3374() {
		assertEquals("20708", customers.get(3373).getZIP());
	}

	@Test
	@DisplayName("Record 3374: Phone is 301-470-0095")
	void PhoneOfRecord3374() {
		assertEquals("301-470-0095", customers.get(3373).getPhone());
	}

	@Test
	@DisplayName("Record 3374: Fax is 301-470-1537")
	void FaxOfRecord3374() {
		assertEquals("301-470-1537", customers.get(3373).getFax());
	}

	@Test
	@DisplayName("Record 3374: Email is monroe@mckin.com")
	void EmailOfRecord3374() {
		assertEquals("monroe@mckin.com", customers.get(3373).getEmail());
	}

	@Test
	@DisplayName("Record 3374: Web is http://www.monroemckin.com")
	void WebOfRecord3374() {
		assertEquals("http://www.monroemckin.com", customers.get(3373).getWeb());
	}
}
