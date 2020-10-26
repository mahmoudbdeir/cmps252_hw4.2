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

@Tag("27")
class Record_662 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 662: FirstName is Nell")
	void FirstNameOfRecord662() {
		assertEquals("Nell", customers.get(661).getFirstName());
	}

	@Test
	@DisplayName("Record 662: LastName is Halvorson")
	void LastNameOfRecord662() {
		assertEquals("Halvorson", customers.get(661).getLastName());
	}

	@Test
	@DisplayName("Record 662: Company is John A Vassilaros & Son Inc")
	void CompanyOfRecord662() {
		assertEquals("John A Vassilaros & Son Inc", customers.get(661).getCompany());
	}

	@Test
	@DisplayName("Record 662: Address is 825 S Sandusky Ave")
	void AddressOfRecord662() {
		assertEquals("825 S Sandusky Ave", customers.get(661).getAddress());
	}

	@Test
	@DisplayName("Record 662: City is Bucyrus")
	void CityOfRecord662() {
		assertEquals("Bucyrus", customers.get(661).getCity());
	}

	@Test
	@DisplayName("Record 662: County is Crawford")
	void CountyOfRecord662() {
		assertEquals("Crawford", customers.get(661).getCounty());
	}

	@Test
	@DisplayName("Record 662: State is OH")
	void StateOfRecord662() {
		assertEquals("OH", customers.get(661).getState());
	}

	@Test
	@DisplayName("Record 662: ZIP is 44820")
	void ZIPOfRecord662() {
		assertEquals("44820", customers.get(661).getZIP());
	}

	@Test
	@DisplayName("Record 662: Phone is 419-562-9325")
	void PhoneOfRecord662() {
		assertEquals("419-562-9325", customers.get(661).getPhone());
	}

	@Test
	@DisplayName("Record 662: Fax is 419-562-0528")
	void FaxOfRecord662() {
		assertEquals("419-562-0528", customers.get(661).getFax());
	}

	@Test
	@DisplayName("Record 662: Email is nell@halvorson.com")
	void EmailOfRecord662() {
		assertEquals("nell@halvorson.com", customers.get(661).getEmail());
	}

	@Test
	@DisplayName("Record 662: Web is http://www.nellhalvorson.com")
	void WebOfRecord662() {
		assertEquals("http://www.nellhalvorson.com", customers.get(661).getWeb());
	}
}
