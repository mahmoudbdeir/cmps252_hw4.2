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

@Tag("23")
class Record_4110 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4110: FirstName is Jamaal")
	void FirstNameOfRecord4110() {
		assertEquals("Jamaal", customers.get(4109).getFirstName());
	}

	@Test
	@DisplayName("Record 4110: LastName is Sussex")
	void LastNameOfRecord4110() {
		assertEquals("Sussex", customers.get(4109).getLastName());
	}

	@Test
	@DisplayName("Record 4110: Company is Brazil Clawson Adlong Murphy")
	void CompanyOfRecord4110() {
		assertEquals("Brazil Clawson Adlong Murphy", customers.get(4109).getCompany());
	}

	@Test
	@DisplayName("Record 4110: Address is 333 Hamilton Blvd  #-34")
	void AddressOfRecord4110() {
		assertEquals("333 Hamilton Blvd  #-34", customers.get(4109).getAddress());
	}

	@Test
	@DisplayName("Record 4110: City is South Plainfield")
	void CityOfRecord4110() {
		assertEquals("South Plainfield", customers.get(4109).getCity());
	}

	@Test
	@DisplayName("Record 4110: County is Middlesex")
	void CountyOfRecord4110() {
		assertEquals("Middlesex", customers.get(4109).getCounty());
	}

	@Test
	@DisplayName("Record 4110: State is NJ")
	void StateOfRecord4110() {
		assertEquals("NJ", customers.get(4109).getState());
	}

	@Test
	@DisplayName("Record 4110: ZIP is 7080")
	void ZIPOfRecord4110() {
		assertEquals("7080", customers.get(4109).getZIP());
	}

	@Test
	@DisplayName("Record 4110: Phone is 908-561-3673")
	void PhoneOfRecord4110() {
		assertEquals("908-561-3673", customers.get(4109).getPhone());
	}

	@Test
	@DisplayName("Record 4110: Fax is 908-561-4474")
	void FaxOfRecord4110() {
		assertEquals("908-561-4474", customers.get(4109).getFax());
	}

	@Test
	@DisplayName("Record 4110: Email is jamaal@sussex.com")
	void EmailOfRecord4110() {
		assertEquals("jamaal@sussex.com", customers.get(4109).getEmail());
	}

	@Test
	@DisplayName("Record 4110: Web is http://www.jamaalsussex.com")
	void WebOfRecord4110() {
		assertEquals("http://www.jamaalsussex.com", customers.get(4109).getWeb());
	}
}
