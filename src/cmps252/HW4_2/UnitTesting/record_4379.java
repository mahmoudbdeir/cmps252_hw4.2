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

@Tag("44")
class Record_4379 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4379: FirstName is Reginald")
	void FirstNameOfRecord4379() {
		assertEquals("Reginald", customers.get(4378).getFirstName());
	}

	@Test
	@DisplayName("Record 4379: LastName is Moranville")
	void LastNameOfRecord4379() {
		assertEquals("Moranville", customers.get(4378).getLastName());
	}

	@Test
	@DisplayName("Record 4379: Company is Business & Ind Fed Crdt Un")
	void CompanyOfRecord4379() {
		assertEquals("Business & Ind Fed Crdt Un", customers.get(4378).getCompany());
	}

	@Test
	@DisplayName("Record 4379: Address is 920 2nd Ave S  #-500")
	void AddressOfRecord4379() {
		assertEquals("920 2nd Ave S  #-500", customers.get(4378).getAddress());
	}

	@Test
	@DisplayName("Record 4379: City is Minneapolis")
	void CityOfRecord4379() {
		assertEquals("Minneapolis", customers.get(4378).getCity());
	}

	@Test
	@DisplayName("Record 4379: County is Hennepin")
	void CountyOfRecord4379() {
		assertEquals("Hennepin", customers.get(4378).getCounty());
	}

	@Test
	@DisplayName("Record 4379: State is MN")
	void StateOfRecord4379() {
		assertEquals("MN", customers.get(4378).getState());
	}

	@Test
	@DisplayName("Record 4379: ZIP is 55402")
	void ZIPOfRecord4379() {
		assertEquals("55402", customers.get(4378).getZIP());
	}

	@Test
	@DisplayName("Record 4379: Phone is 612-334-1709")
	void PhoneOfRecord4379() {
		assertEquals("612-334-1709", customers.get(4378).getPhone());
	}

	@Test
	@DisplayName("Record 4379: Fax is 612-334-7197")
	void FaxOfRecord4379() {
		assertEquals("612-334-7197", customers.get(4378).getFax());
	}

	@Test
	@DisplayName("Record 4379: Email is reginald@moranville.com")
	void EmailOfRecord4379() {
		assertEquals("reginald@moranville.com", customers.get(4378).getEmail());
	}

	@Test
	@DisplayName("Record 4379: Web is http://www.reginaldmoranville.com")
	void WebOfRecord4379() {
		assertEquals("http://www.reginaldmoranville.com", customers.get(4378).getWeb());
	}
}
