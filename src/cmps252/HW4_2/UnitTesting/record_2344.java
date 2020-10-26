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

@Tag("42")
class Record_2344 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2344: FirstName is Haywood")
	void FirstNameOfRecord2344() {
		assertEquals("Haywood", customers.get(2343).getFirstName());
	}

	@Test
	@DisplayName("Record 2344: LastName is Barrieau")
	void LastNameOfRecord2344() {
		assertEquals("Barrieau", customers.get(2343).getLastName());
	}

	@Test
	@DisplayName("Record 2344: Company is Coast To Coast")
	void CompanyOfRecord2344() {
		assertEquals("Coast To Coast", customers.get(2343).getCompany());
	}

	@Test
	@DisplayName("Record 2344: Address is Hwy 71b B")
	void AddressOfRecord2344() {
		assertEquals("Hwy 71b B", customers.get(2343).getAddress());
	}

	@Test
	@DisplayName("Record 2344: City is Springdale")
	void CityOfRecord2344() {
		assertEquals("Springdale", customers.get(2343).getCity());
	}

	@Test
	@DisplayName("Record 2344: County is Washington")
	void CountyOfRecord2344() {
		assertEquals("Washington", customers.get(2343).getCounty());
	}

	@Test
	@DisplayName("Record 2344: State is AR")
	void StateOfRecord2344() {
		assertEquals("AR", customers.get(2343).getState());
	}

	@Test
	@DisplayName("Record 2344: ZIP is 72764")
	void ZIPOfRecord2344() {
		assertEquals("72764", customers.get(2343).getZIP());
	}

	@Test
	@DisplayName("Record 2344: Phone is 479-751-6212")
	void PhoneOfRecord2344() {
		assertEquals("479-751-6212", customers.get(2343).getPhone());
	}

	@Test
	@DisplayName("Record 2344: Fax is 479-751-2448")
	void FaxOfRecord2344() {
		assertEquals("479-751-2448", customers.get(2343).getFax());
	}

	@Test
	@DisplayName("Record 2344: Email is haywood@barrieau.com")
	void EmailOfRecord2344() {
		assertEquals("haywood@barrieau.com", customers.get(2343).getEmail());
	}

	@Test
	@DisplayName("Record 2344: Web is http://www.haywoodbarrieau.com")
	void WebOfRecord2344() {
		assertEquals("http://www.haywoodbarrieau.com", customers.get(2343).getWeb());
	}
}
